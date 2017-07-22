grammar SaplingAbt;

/* 

    ## Parse Sapling ABT config file

    *Parser is built to read the output of 'show running-config' or 'show startup-config' 
    * Top level command should start without space. 
    * Subcommand is indented by one space.
    * Command or sub-command is in one line. 

   ## The Rule for generating g4 file from the spec file
*. Each command is a rule
*. Rule name use all the literals up to first alternative. Duplicate rulename use '_1' '_2' to differentiate.
*. Tokens with 'begin of line' condition will be named with postfix of '_BOL'.
*. Keyword token will be generated for literals in the command, except the first literal which will have a separate token for starting of a command.
*. In the parser rule, command literals will remain as 'literals' for easy of reading. Antlr will try to find the matching keyword token and use it in the rule.
*. If non-starting literals in a command duplicates with a command-starting literal, there will be two tokens generated for that literal. One for the start of command,
   the other for the non-starting literal. The non-starting literals in the command needs to use the keyword token, instead of the literal form.
   Antlr will have a problem with 'redundant string literals', in which case it doesn't know what token to replace the literal with.


    ## Auto-detect rule
    Rule 1: it has something like '!config' in the first few line 
*/
    
zeeConfig
    :   zeeCommand *
        NEWLINE*
    ;

zeeCommand
    : zeeKnownCommand
    | zeeComment
    | zeeUnknownCommand  
    ;
    
zeeComment
    : COMMENT_BOL+
    ;

zeeUnknownCommand
    : zeeWord eol       //command start at the beginning of the line, consume all the subsequent line with leading space
      zeeUnknownCommandSub *
    | zeeWsBOL zeeWord eol  //Command starts with leading space, treat it as one single command
    | eol  //command starting with non-space, non-text, it could be empty line. 
    ;
    
zeeUnknownCommandSub
    : zeeWsBOL zeeWord eol
    ;
    
zeeKnownCommand
    :   hostname
    |   interfaceRule
        
    |   addressCmd
    |   addressGroup
    |   address6
    |   serviceCmd
    |   serviceGroup
    |   timezone
    |   scheduleDay
    |   scheduleWeek
    |   scheduleMonth
    |   scheduleOnce
    |   applicationGroup
    |   zone
        
    //not used, need to above userCmd to grab 'user' 'administrator' command
    |   userAdministrator        
    |   userCmd
    |   userGroup
    |   policy
    |   policyDefaultAction
    |   policy6
    |   policy6DefaultAction
     
    //routing
    |   ipRoute
    |   proute
    |   ispNetwork
    |   ipv6Route
    |   router
        
    //NAT
    |   ipNatPool
    |   ipNatSource
    |   ipNatDest
    |   ipNatStatic
     
    //VPN IPsec
    |   vpnIpsecPhase1
    |   vpnIpsecPhase2
        
    ;


/*
 * known commands
 */

//device name
hostname
    : 'hostname' deviceName=zeeText eol
    ;  //default is "ABT"

/* ## password for obscure
 * Any string that has the format of %@%@...%@%@ can be considered as password text.
?? what about the following command:
    ppp pap local-user username password { cipher | simple } password
    ppp chap password { cipher | simple } password
    user name <username> password { cipher | simple } <password> ... (under 'apn profile' command)
*/


interfaceRule
    : 'interface' interfaceName=zeeWord (tunnelNum=INT)? eol
      ( interfaceSub )*
    ;

interfaceSub
    : ONE_WS_BOL 'description' description=zeeText eol  #interfaceRule_Description
    | ONE_WS_BOL 'shutdown' eol #interfaceRule_Shutdown
    | ONE_WS_BOL 'bridge-group' bridgeGroup=INT eol #interfaceRule_BridgeGroup //assigning the interface to a bridge group in transparent mode.

    | ONE_WS_BOL 'ip' 'address' 'dhcp' eol #interfaceRule_IpAddressDhcp
    | ONE_WS_BOL 'ip' 'address' address=IP4_W_LEN ( secondary='secondary' )? eol #interfaceRule_IpAddress //address is A.B.C.D/x
    | ONE_WS_BOL 'ip' 'address' 'pppoe' (address=IP4)? eol #interfaceRule_IpAddressPPPoE 

    | ONE_WS_BOL 'ip' 'vrf' 'forwarding' vrfName=zeeWord eol #interfaceRule_Vrf

    //IP6
    //the order here is important. We need to match the specific one first
    | ONE_WS_BOL 'ipv6' 'address' 'auto' 'link-local' eol #interfaceRule_Ip6AutoLinklocal
    | ONE_WS_BOL 'ipv6' 'address' ip6AddressAndPrefix=IP6_W_LEN  (secondary='secondary')? (eui='eui-64')?  eol #interfaceRule_Ip6
    | ONE_WS_BOL 'ipv6' 'address' ip6Address=IP6 'link-local' eol #interfaceRule_Ip6LinkLocal

    //VPN IPsec
    //defines what traffic will be send to this tunnel
    | TWO_WS_BOL 'tunnel-ipsec' 'interested-subnet' 'pair' srcIpLen=IP4_W_LEN dstIpLen=IP4_W_LEN eol #interfaceRule_TunnelIpsecSubnet
    //link this tunnel interface to the IPsec object which will link to peer information.
    | TWO_WS_BOL 'tunnel-ipsec' tunnelName=zeeWord eol  #interfaceRule_TunnelIpsec

    | zeeWsBOL eol  #interfaceRule_ZeeIgnore

    ;


//Objects and Object groups

//network object/address

//it has default address name: 'any' and 'private' defined for IP4
//any: 0.0.0.0/0
//private: 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16
//'address', 'address-group', 'address6' all shares the same name space. 
//Name cannot duplicate between them.
addressCmd 
    : 'address' name=zeeWord eol
      ( subAddressCmd )*
    ;

subAddressCmd
    : ONE_WS_BOL 'description' desc=zeeText eol #address_Desc

    | ONE_WS_BOL 'ip' 'address' addr=IP4 eol #address_IpAddr
    | ONE_WS_BOL 'ip' 'host' host=zeeWord eol #address_IpHost
    | ONE_WS_BOL 'ip' 'range' start=IP4 end=IP4 eol #address_IpRange
    | ONE_WS_BOL 'ip' 'subnet' subnet=IP4_W_LEN eol #address_Subnet

    //exclude clause
    | ONE_WS_BOL 'exclude' 'ip' 'address' addr=IP4 eol #address_ExcludeIpAddr
    | ONE_WS_BOL 'exclude' 'ip' 'host' host=zeeWord eol #address_ExcludeIpHost
    | ONE_WS_BOL 'exclude' 'ip' 'range' start=IP4 end=IP4 eol #address_ExcludeIpRange
    | ONE_WS_BOL 'exclude' 'ip' 'subnet' subnet=IP4_W_LEN eol #address_ExcludeSubnet

    //others to ignore
    | zeeWsBOL eol  # address_ZeeIgnore //catching additional unknown subcommands
    ;

address6
    : 'address6' name=zeeWord eol
      ( subAddress6 )*
    ;

subAddress6
    : ONE_WS_BOL 'description' desc=zeeText eol #address6_Desc

    | ONE_WS_BOL 'ipv6' 'address' addr=IP6 eol #address6_IpAddr
    | ONE_WS_BOL 'ipv6' 'range' start=IP6 end=IP6 eol #address6_IpRange
    | ONE_WS_BOL 'ipv6' 'subnet' subnet=IP6_W_LEN eol #address6_Subnet

    //exclude clause
    | ONE_WS_BOL 'exclude' 'ipv6' 'address' addr=IP6 eol #address6_ExcludeIpAddr
    | ONE_WS_BOL 'exclude' 'ipv6' 'range' start=IP6 end=IP6 eol #address6_ExcludeIpRange
    | ONE_WS_BOL 'exclude' 'ipv6' 'subnet' subnet=IP6_W_LEN eol #address6_ExcludeSubnet

    //others to ignore
    | zeeWsBOL eol  # address6_ZeeIgnore //catching additional unknown subcommands

    ;

addressGroup
    : 'address-group' name=zeeWord eol
      ( subAddressGroup )*
    ;

subAddressGroup
    : ONE_WS_BOL 'description' desc=zeeText eol #addressGroup_Desc
    | ONE_WS_BOL 'member' memberName=zeeWord eol #addressGroup_Member //memberName can be address or addressGroup name

    //others to ignore
    | zeeWsBOL eol  #addressGroup_ZeeIgnore //catching additional unknown subcommands
    ;

serviceCmd
    : 'service' serviceObjectName=zeeWord eol
        ( subServiceCmd )*
    ;

subServiceCmd
    : ONE_WS_BOL 'description' desc=zeeText eol   #service_Desc
    | ONE_WS_BOL 'icmp' 'type' icmpType=INT 'code' startCode=INT endCode=INT eol #service_Icmp
    | ONE_WS_BOL 'protocol' protoNum=INT eol #service_Protocol
    | ONE_WS_BOL 'tcp' 'dst-port' dstPortStart=INT dstPortEnd=INT 'src-port' srcPortStart=INT srcPortEnd=INT eol #service_Tcp
    | ONE_WS_BOL 'udp' 'dst-port' dstPortStart=INT dstPortEnd=INT 'src-port' srcPortStart=INT srcPortEnd=INT eol #service_Udp

    | zeeWsBOL eol  # service_ZeeIgnore
    ;

serviceGroup
    : 'service-group' name=zeeWord eol
      ( subServiceGroup )*
    ;

subServiceGroup
    : ONE_WS_BOL 'description' desc=zeeText eol #serviceGroup_Desc
    | ONE_WS_BOL 'member' memberName=zeeWord eol #serviceGroup_Member //memberName can be service or serviceGroup name

    //others to ignore
    | zeeWsBOL eol  #serviceGroup_ZeeIgnore //catching additional unknown subcommands
    ;

timezone
    : 'timezone' zoneNum=INT eol  //zone is 1-75, Beijing is 57. Is there a reason this value is set to not 57?
    ;

//schedule related objects, the name needs to be unique among all of them
scheduleDay
    : 'schedule-day' name=zeeWord eol
      ( subScheduleDay ) *
    ;

subScheduleDay
    : ONE_WS_BOL 'description' desc=zeeText eol #scheduleDay_Desc
    | ONE_WS_BOL 'periodic' 'start' startTime=zeeWord 'end' endTime=zeeWord eol #scheduleDay_Periodic
    | zeeWsBOL eol  #scheduleDay_ZeeIgnore //catching additional unknown subcommands
    ;

scheduleWeek
    : 'schedule-week' name=zeeWord eol
      ( subScheduleWeek )*
    ;

subScheduleWeek
    : ONE_WS_BOL 'description' desc=zeeText eol #scheduleWeek_Desc
    //dayScheduleName can be 'always' which is a built-in name
    | ONE_WS_BOL 'day' day=('sunday'|'monday'|'tuesday'|'wednesday'|'thursday'|'friday'|'saturday'|'allday') dayScheduleName=zeeWord eol #scheduleWeek_Day
    | zeeWsBOL eol  #scheduleWeek_ZeeIgnore //catching additional unknown subcommands
    ;

scheduleMonth
    : 'schedule-month' name=zeeWord eol
      ( subScheduleMonth )*
    ;

subScheduleMonth
    : ONE_WS_BOL 'description' desc=zeeText eol #scheduleMonth_Desc
    | ONE_WS_BOL 'day' 'start' startDay=INT  'end' endDay=INT dayScheduleName=zeeWord eol #scheduleMonth_Day
    | zeeWsBOL eol  #scheduleMonth_ZeeIgnore //catching additional unknown subcommands
    ;

scheduleOnce
    : 'schedule-once' name=zeeWord eol
      ( subScheduleOnce )*
    ;

subScheduleOnce
    : ONE_WS_BOL 'description' desc=zeeText eol #scheduleOnce_Desc
    //date format is YYYY-MM-DD, time format is HH:MM in 24 hour format.
    //if 'absolute' is not set, it takes the value of '2011-10-26 00:00' to '2011-10-26 00:00'      
    | ONE_WS_BOL 'absolute' 'start' startDate=zeeWord startTime=zeeWord 'end' endDate=zeeWord endTime=zeeWord eol #scheduleOnce_Absolute
    //use other time object as member, but cannot use another schedule-once object. 
    | ONE_WS_BOL 'member' timeObjName=zeeWord eol #scheduleOnce_Member
    | zeeWsBOL eol  #scheduleOnce_ZeeIgnore //catching additional unknown subcommands
    ;

//Application Group, device has a few built-in application groups too, like IM_Software, P2P_Software, Ecommerce, etc. 
//Application is predefined by the device (user cannot add more application)
applicationGroup
    : 'application-group' name=zeeWord eol
      ( subApplicationGroup )*
    ;

subApplicationGroup
    : ONE_WS_BOL 'description' desc=zeeText eol #applicationGroup_Desc
    | ONE_WS_BOL 'member' 'application' appName=zeeWord eol #applicationGroup_Member
    | zeeWsBOL eol  #applicationGroup_ZeeIgnore //catching additional unknown subcommands
    ;

//this is a comand we don't care, but we added it so that userCmd will not grab that line.
userAdministrator
    : 'user' 'administrator' eol
    ;

userCmd
    : 'user' name=zeeWord eol
      ( subUserCmd )*
    ;

subUserCmd
    : ONE_WS_BOL 'description' desc=zeeText eol #user_Desc
    | zeeWsBOL eol  #user_ZeeIgnore //catching additional unknown subcommands
    ;

userGroup
    : 'user-group' name=zeeWord eol
      ( subUserGroup )*
    ;

subUserGroup
    : ONE_WS_BOL 'description' desc=zeeText eol #userGroup_Desc
    | ONE_WS_BOL 'member' userOrGroupName=zeeWord eol #userGroup_Member
    | zeeWsBOL eol  #userGroup_ZeeIgnore //catching additional unknown subcommands
    ;

zone
    : 'zone' zoneName=zeeWord eol 
      (opt += subZone )*
    ;
subZone
    : ONE_WS_BOL 'description' desc=zeeText NEWLINE
    | ONE_WS_BOL 'include' 'interface' ifName=zeeWord eol
    | ignoreSubCommand
    ;

policy
    //audit/noaudit is for 上网行为管理设备, their config are very similar, we try to parse both.
    : 'policy' inIf=zeeWord outIf=zeeWord srcAddr=zeeWord dstAddr=zeeWord serviceName=zeeWord 
      userName=zeeWord appName=zeeWord scheduleName=zeeWord
      action=('deny'|'permit'|'ipsec'|'audit'|'noaudit') id=INT eol
      ( subPolicy )*
    ;
    
subPolicy
    : FOUR_WS_BOL 'description' desc=zeeText eol #policy_Desc

    | FOUR_WS_BOL 'application' appOrGroupName=zeeWord eol #policy_Application
    | FOUR_WS_BOL 'dest-address' dstAddrName=zeeWord eol #policy_DestAddress
    | FOUR_WS_BOL 'disable' eol #policy_Disable
    | FOUR_WS_BOL 'log' logOption=zeeText eol #policy_Log  //'log policy-deny enable' default is 'disable'
    | FOUR_WS_BOL 'service' serviceName=zeeWord eol #policy_Service
    | FOUR_WS_BOL 'source-address' srcAddrName=zeeWord eol #policy_SourceAddress
    | FOUR_WS_BOL 'user' userOrGroupName=zeeWord eol #policy_User


    //other features: url filter, app filter, anti-virus, etc, only apply when action is permit
    //we treat all the same as additional action
    | zeeWsBOL eol  #policy_Misc
    ;

policyDefaultAction  //if not found, the default action is 'permit'
    : 'policy' 'default-action' action=('permit' | 'deny') eol
    ;

policy6
    //policy6 doesn't support user/application yet. So it is 'any' for both field
    //if action is not present, its default value is 'ipsec'
    : 'policy6' inIf=zeeWord outIf=zeeWord srcAddr=zeeWord dstAddr=zeeWord serviceName=zeeWord 
      'any' 'any' scheduleName=zeeWord action=('deny' | 'permit' | 'ipsec' | 'audit' | 'noaudit')? id=INT eol
      ( subPolicy6 )*
    ;

subPolicy6
    : FOUR_WS_BOL 'description' desc=zeeText eol #policy6_Desc
    //the device allows IP4 address to be used here, will those addresses ignore by the system?
    | FOUR_WS_BOL 'dest-address' dstAddrName=zeeWord eol #policy6_DestAddress
    | FOUR_WS_BOL 'disable' eol #policy6_Disable
    | FOUR_WS_BOL 'log' logOption=zeeText eol #policy6_Log  //'log policy-deny enable' default is 'disable'
    | FOUR_WS_BOL 'service' serviceName=zeeWord eol #policy6_Service
    | FOUR_WS_BOL 'source-address' srcAddrName=zeeWord eol #policy6_SourceAddress
    | zeeWsBOL eol  #policy6_ZeeIgnore //catching additional unknown subcommands
    ;

policy6DefaultAction  //if not found, the default action is 'permit'
    : 'policy6' 'default-action' action=('permit' | 'deny') eol
    ;

/*
 ** Routing **
 */
ipRoute
        //need to be above ipRoute_IP4, otherwise 'blackhole' will be matched with 'eol' in ipRoute_IP4
    : 'ip' 'route' ip4=IP4_W_LEN nexthop=zeeWord action=('blackhole'|'reject') eol #ipRoute_BhRj 
    | 'ip' 'route' ip4=IP4_W_LEN nexthop=zeeWord (distance=INT)? ( 'weight' weight=INT)? eol #ipRoute_IP4
        //need to be above ipRoute_ISP, otherwise it will match that
    | 'ip' 'route' 'vrf' vrfName=zeeWord ip4=IP4_W_LEN nexthop=zeeWord ( 'weight' weight=INT)? eol #ipRoute_VrfIp4 
    | 'ip' 'route' ispName=zeeWord nexthop=zeeWord (distance=INT)? ( 'weight' weight=INT)? eol #ipRoute_ISP
    ;

proute
    : 'proute' inIf=zeeWord srcAddr=zeeWord dstAddr=zeeWord serviceName=zeeWord 
      userName=zeeWord appName=zeeWord scheduleName=zeeWord
      nexthopOrIf=zeeWord id=INT ('weight' weight=INT)? eol
    ;

ispNetwork
    : 'isp' 'network' name=zeeWord eol
      ( subIspNetwork )*
    ;

subIspNetwork
    : ONE_WS_BOL 'subnet' ip4=IP4_W_LEN eol #ispNetwork_Subnet
    | ignoreSubCommand #ispNetwork_Ignore
    ;

ipv6Route
    : 'ipv6' 'route' ip6=IP6_W_LEN (nexthop=IP6 (ifName=zeeWord)? | ifName2=zeeWord ) eol  
    ;

router
    : 'router' name=('rip'| 'ospf' | 'ospf6') eol  //config dynamic routing protocol
       (ignoreSubCommand) *
    ;


/*
 ** NAT **
 */
ipNatPool
    : 'ip' 'nat' 'pool' name=zeeWord eol 
      (subIpNatPool) *
    ;
subIpNatPool
    : ONE_WS_BOL 'ip' 'address' start=IP4 end=IP4 eol #ipNatPool_IpAddr
    | ONE_WS_BOL 'description' desc=zeeText eol #ipNatPool_Desc
    | ignoreSubCommand #ipNatPool_Ignore
    ;

ipNatSource
    //natTo uses 'ip nat pool' object
    : 'ip' 'nat' 'source' ifName=zeeWord src=zeeWord dst=zeeWord 
      service=zeeWord natTo=zeeWord ('log')? id=INT eol   
    ;

ipNatDest
    //natTo uses 'ip nat pool' object
    : 'ip' 'nat' 'destination' ifName=zeeWord src=zeeWord dst=zeeWord 
      service=zeeWord natTo=zeeWord ( 'service' portTo=INT )? ('log')? id=INT eol
    ;

ipNatStatic
    : 'ip' 'nat' 'static' ifName=zeeWord localIp=IP4 globalIp=IP4 ('log')? id=INT eol
    ;


/*
 ** VPN **
 */
vpnIpsecPhase1
    : 'vpn' 'ipsec' 'phase1' eol
      TWO_WS_BOL 'edit' 'gateway' gatewayName=zeeWord eol
      ( FOUR_WS_BOL 'set' 'remotegw' ( remoteIp=IP4 | 'hostname' remoteHostname=zeeWord | dynamic='dynamic' ) eol
      | FOUR_WS_BOL 'set' 'local' (localIp=IP4 | localIf=zeeWord ) eol
      | ignoreSubCommand
      )*
    ;

vpnIpsecPhase2
    : 'vpn' 'ipsec' 'phase2' eol
      TWO_WS_BOL 'edit' 'tunnel' tunnelName=zeeWord eol
      ( FOUR_WS_BOL 'set' 'peer' peerName=zeeWord eol
      | ignoreSubCommand
      )*
    ;

ignoreSubCommand
    : zeeWsBOL eol 
    ;

//zeeAny: .*? ;

zeeText 
    : zeeWord+ ;

zeeWord
    : ~( NEWLINE
       | COMMENT_BOL
       | ONE_WS_BOL
       | TWO_WS_BOL
       | THREE_WS_BOL
       | FOUR_WS_BOL
       | ANY_WS_BOL
       | ILLEGAL ) //sometimes the keyword is used in the context of zeeText. The Lexer will return it as the token of that keyword and not 'WORD',
                  // causing it to not match zeeText. That is why we need to add all the keyword token to matching list.
    ;

eol    //matching all the way to the end of the line
    : (~NEWLINE)* NEWLINE
    ;
       
zeeWsBOL
    : ( ONE_WS_BOL
    | TWO_WS_BOL
    | THREE_WS_BOL
    | FOUR_WS_BOL
    | ANY_WS_BOL )
    ;

//command-starting tokens should be listed before keywords
//The 'Begin-Of-Line' tokens need to be at the top so that it will match first.

COMMENT_BOL : '!' .*? NEWLINE {_tokenStartCharPositionInLine==0}?  ;
QUOTE:  '"' .*? '"' ; 
         
IP6_W_LEN: (IP6 | IP_NAME) '/' INT ;  
IP4_W_LEN: IP4 '/' INT;

IP6:  [0-9a-fA-F:]+ ':' ( HEX_CODE? HEX_CODE? HEX_CODE? HEX_CODE? | IP4 );

//keywords
//Matching literal tokens will use these token in the rule. We have to explicitly define them here so that they are under the 'BOL' tokens.
//Cannot use the default generated literal tokens by antlr. It places them before the explicit tokens.


IP4     : NUM_3DIGIT '.' NUM_3DIGIT '.' NUM_3DIGIT '.' NUM_3DIGIT ;
INT     : NUMBER+ ;
WORD    : ~[ \t\f\r\n]+ ;

NEWLINE	: '\r' '\n'?
        | '\n'
        ;

ONE_WS_BOL  : ' ' { _tokenStartCharPositionInLine==0 }? ;
TWO_WS_BOL  : '  ' { _tokenStartCharPositionInLine==0 }? ;
THREE_WS_BOL: '   ' { _tokenStartCharPositionInLine==0 }? ;
FOUR_WS_BOL : '    ' { _tokenStartCharPositionInLine==0 }? ;
//five or more whitespace at beginning of the line
ANY_WS_BOL  : [ \t\f]+ { _tokenStartCharPositionInLine==0 }? ;  //WS at the beginning of line. Cannot be ignored. This needs to be above WS.
WS      : [ \t\f]+ -> skip ;


ILLEGAL : . -> skip  ; // after all other lexer rules

fragment IP_NAME: [a-zA-Z_-] [a-zA-Z0-9_-]* ;  //Name used in 'name <ip> <name> command'
fragment HEX_CODE: [0-9a-fA-F]; 
fragment NUM_3DIGIT : NUMBER NUMBER? NUMBER? ;
fragment LETTER  : 'a'..'z' | 'A'..'Z' ;
fragment NUMBER  : '0'..'9' ;

/* 
    ##Notes 


*/