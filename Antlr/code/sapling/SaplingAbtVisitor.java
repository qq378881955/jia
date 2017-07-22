// Generated from SaplingAbt.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SaplingAbtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SaplingAbtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeConfig(SaplingAbtParser.ZeeConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeCommand(SaplingAbtParser.ZeeCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeComment(SaplingAbtParser.ZeeCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeUnknownCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeUnknownCommand(SaplingAbtParser.ZeeUnknownCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeUnknownCommandSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeUnknownCommandSub(SaplingAbtParser.ZeeUnknownCommandSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeKnownCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeKnownCommand(SaplingAbtParser.ZeeKnownCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(SaplingAbtParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#interfaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule(SaplingAbtParser.InterfaceRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_Description}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_Description(SaplingAbtParser.InterfaceRule_DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_Shutdown}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_Shutdown(SaplingAbtParser.InterfaceRule_ShutdownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_BridgeGroup}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_BridgeGroup(SaplingAbtParser.InterfaceRule_BridgeGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_IpAddressDhcp}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_IpAddressDhcp(SaplingAbtParser.InterfaceRule_IpAddressDhcpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_IpAddress}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_IpAddress(SaplingAbtParser.InterfaceRule_IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_IpAddressPPPoE}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_IpAddressPPPoE(SaplingAbtParser.InterfaceRule_IpAddressPPPoEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_Vrf}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_Vrf(SaplingAbtParser.InterfaceRule_VrfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_Ip6AutoLinklocal}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_Ip6AutoLinklocal(SaplingAbtParser.InterfaceRule_Ip6AutoLinklocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_Ip6}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_Ip6(SaplingAbtParser.InterfaceRule_Ip6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_Ip6LinkLocal}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_Ip6LinkLocal(SaplingAbtParser.InterfaceRule_Ip6LinkLocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_TunnelIpsecSubnet}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_TunnelIpsecSubnet(SaplingAbtParser.InterfaceRule_TunnelIpsecSubnetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_TunnelIpsec}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_TunnelIpsec(SaplingAbtParser.InterfaceRule_TunnelIpsecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceRule_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#interfaceSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule_ZeeIgnore(SaplingAbtParser.InterfaceRule_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#addressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressCmd(SaplingAbtParser.AddressCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_Desc(SaplingAbtParser.Address_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_IpAddr}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_IpAddr(SaplingAbtParser.Address_IpAddrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_IpHost}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_IpHost(SaplingAbtParser.Address_IpHostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_IpRange}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_IpRange(SaplingAbtParser.Address_IpRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_Subnet}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_Subnet(SaplingAbtParser.Address_SubnetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_ExcludeIpAddr}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_ExcludeIpAddr(SaplingAbtParser.Address_ExcludeIpAddrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_ExcludeIpHost}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_ExcludeIpHost(SaplingAbtParser.Address_ExcludeIpHostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_ExcludeIpRange}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_ExcludeIpRange(SaplingAbtParser.Address_ExcludeIpRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_ExcludeSubnet}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_ExcludeSubnet(SaplingAbtParser.Address_ExcludeSubnetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subAddressCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_ZeeIgnore(SaplingAbtParser.Address_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#address6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6(SaplingAbtParser.Address6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_Desc(SaplingAbtParser.Address6_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_IpAddr}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_IpAddr(SaplingAbtParser.Address6_IpAddrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_IpRange}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_IpRange(SaplingAbtParser.Address6_IpRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_Subnet}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_Subnet(SaplingAbtParser.Address6_SubnetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_ExcludeIpAddr}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_ExcludeIpAddr(SaplingAbtParser.Address6_ExcludeIpAddrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_ExcludeIpRange}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_ExcludeIpRange(SaplingAbtParser.Address6_ExcludeIpRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_ExcludeSubnet}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_ExcludeSubnet(SaplingAbtParser.Address6_ExcludeSubnetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code address6_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subAddress6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress6_ZeeIgnore(SaplingAbtParser.Address6_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#addressGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressGroup(SaplingAbtParser.AddressGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addressGroup_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subAddressGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressGroup_Desc(SaplingAbtParser.AddressGroup_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addressGroup_Member}
	 * labeled alternative in {@link SaplingAbtParser#subAddressGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressGroup_Member(SaplingAbtParser.AddressGroup_MemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addressGroup_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subAddressGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressGroup_ZeeIgnore(SaplingAbtParser.AddressGroup_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#serviceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceCmd(SaplingAbtParser.ServiceCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code service_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subServiceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_Desc(SaplingAbtParser.Service_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code service_Icmp}
	 * labeled alternative in {@link SaplingAbtParser#subServiceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_Icmp(SaplingAbtParser.Service_IcmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code service_Protocol}
	 * labeled alternative in {@link SaplingAbtParser#subServiceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_Protocol(SaplingAbtParser.Service_ProtocolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code service_Tcp}
	 * labeled alternative in {@link SaplingAbtParser#subServiceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_Tcp(SaplingAbtParser.Service_TcpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code service_Udp}
	 * labeled alternative in {@link SaplingAbtParser#subServiceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_Udp(SaplingAbtParser.Service_UdpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code service_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subServiceCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_ZeeIgnore(SaplingAbtParser.Service_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#serviceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceGroup(SaplingAbtParser.ServiceGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code serviceGroup_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subServiceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceGroup_Desc(SaplingAbtParser.ServiceGroup_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code serviceGroup_Member}
	 * labeled alternative in {@link SaplingAbtParser#subServiceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceGroup_Member(SaplingAbtParser.ServiceGroup_MemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code serviceGroup_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subServiceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceGroup_ZeeIgnore(SaplingAbtParser.ServiceGroup_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone(SaplingAbtParser.TimezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#scheduleDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleDay(SaplingAbtParser.ScheduleDayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleDay_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleDay_Desc(SaplingAbtParser.ScheduleDay_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleDay_Periodic}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleDay_Periodic(SaplingAbtParser.ScheduleDay_PeriodicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleDay_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleDay_ZeeIgnore(SaplingAbtParser.ScheduleDay_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#scheduleWeek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleWeek(SaplingAbtParser.ScheduleWeekContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleWeek_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleWeek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleWeek_Desc(SaplingAbtParser.ScheduleWeek_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleWeek_Day}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleWeek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleWeek_Day(SaplingAbtParser.ScheduleWeek_DayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleWeek_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleWeek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleWeek_ZeeIgnore(SaplingAbtParser.ScheduleWeek_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#scheduleMonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleMonth(SaplingAbtParser.ScheduleMonthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleMonth_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleMonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleMonth_Desc(SaplingAbtParser.ScheduleMonth_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleMonth_Day}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleMonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleMonth_Day(SaplingAbtParser.ScheduleMonth_DayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleMonth_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleMonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleMonth_ZeeIgnore(SaplingAbtParser.ScheduleMonth_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#scheduleOnce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleOnce(SaplingAbtParser.ScheduleOnceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleOnce_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleOnce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleOnce_Desc(SaplingAbtParser.ScheduleOnce_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleOnce_Absolute}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleOnce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleOnce_Absolute(SaplingAbtParser.ScheduleOnce_AbsoluteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleOnce_Member}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleOnce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleOnce_Member(SaplingAbtParser.ScheduleOnce_MemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scheduleOnce_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subScheduleOnce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleOnce_ZeeIgnore(SaplingAbtParser.ScheduleOnce_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#applicationGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationGroup(SaplingAbtParser.ApplicationGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applicationGroup_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subApplicationGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationGroup_Desc(SaplingAbtParser.ApplicationGroup_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applicationGroup_Member}
	 * labeled alternative in {@link SaplingAbtParser#subApplicationGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationGroup_Member(SaplingAbtParser.ApplicationGroup_MemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applicationGroup_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subApplicationGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationGroup_ZeeIgnore(SaplingAbtParser.ApplicationGroup_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#userAdministrator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserAdministrator(SaplingAbtParser.UserAdministratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#userCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserCmd(SaplingAbtParser.UserCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code user_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subUserCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_Desc(SaplingAbtParser.User_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code user_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subUserCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_ZeeIgnore(SaplingAbtParser.User_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#userGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserGroup(SaplingAbtParser.UserGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userGroup_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subUserGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserGroup_Desc(SaplingAbtParser.UserGroup_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userGroup_Member}
	 * labeled alternative in {@link SaplingAbtParser#subUserGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserGroup_Member(SaplingAbtParser.UserGroup_MemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userGroup_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subUserGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserGroup_ZeeIgnore(SaplingAbtParser.UserGroup_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone(SaplingAbtParser.ZoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#subZone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubZone(SaplingAbtParser.SubZoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy(SaplingAbtParser.PolicyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_Desc(SaplingAbtParser.Policy_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_Application}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_Application(SaplingAbtParser.Policy_ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_DestAddress}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_DestAddress(SaplingAbtParser.Policy_DestAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_Disable}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_Disable(SaplingAbtParser.Policy_DisableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_Log}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_Log(SaplingAbtParser.Policy_LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_Service}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_Service(SaplingAbtParser.Policy_ServiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_SourceAddress}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_SourceAddress(SaplingAbtParser.Policy_SourceAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_User}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_User(SaplingAbtParser.Policy_UserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy_Misc}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_Misc(SaplingAbtParser.Policy_MiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#policyDefaultAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicyDefaultAction(SaplingAbtParser.PolicyDefaultActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#policy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6(SaplingAbtParser.Policy6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code policy6_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6_Desc(SaplingAbtParser.Policy6_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy6_DestAddress}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6_DestAddress(SaplingAbtParser.Policy6_DestAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy6_Disable}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6_Disable(SaplingAbtParser.Policy6_DisableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy6_Log}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6_Log(SaplingAbtParser.Policy6_LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy6_Service}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6_Service(SaplingAbtParser.Policy6_ServiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy6_SourceAddress}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6_SourceAddress(SaplingAbtParser.Policy6_SourceAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code policy6_ZeeIgnore}
	 * labeled alternative in {@link SaplingAbtParser#subPolicy6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6_ZeeIgnore(SaplingAbtParser.Policy6_ZeeIgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#policy6DefaultAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy6DefaultAction(SaplingAbtParser.Policy6DefaultActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipRoute_BhRj}
	 * labeled alternative in {@link SaplingAbtParser#ipRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpRoute_BhRj(SaplingAbtParser.IpRoute_BhRjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipRoute_IP4}
	 * labeled alternative in {@link SaplingAbtParser#ipRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpRoute_IP4(SaplingAbtParser.IpRoute_IP4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ipRoute_VrfIp4}
	 * labeled alternative in {@link SaplingAbtParser#ipRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpRoute_VrfIp4(SaplingAbtParser.IpRoute_VrfIp4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ipRoute_ISP}
	 * labeled alternative in {@link SaplingAbtParser#ipRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpRoute_ISP(SaplingAbtParser.IpRoute_ISPContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#proute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProute(SaplingAbtParser.ProuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#ispNetwork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIspNetwork(SaplingAbtParser.IspNetworkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ispNetwork_Subnet}
	 * labeled alternative in {@link SaplingAbtParser#subIspNetwork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIspNetwork_Subnet(SaplingAbtParser.IspNetwork_SubnetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ispNetwork_Ignore}
	 * labeled alternative in {@link SaplingAbtParser#subIspNetwork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIspNetwork_Ignore(SaplingAbtParser.IspNetwork_IgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#ipv6Route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv6Route(SaplingAbtParser.Ipv6RouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#router}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouter(SaplingAbtParser.RouterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#ipNatPool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpNatPool(SaplingAbtParser.IpNatPoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipNatPool_IpAddr}
	 * labeled alternative in {@link SaplingAbtParser#subIpNatPool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpNatPool_IpAddr(SaplingAbtParser.IpNatPool_IpAddrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipNatPool_Desc}
	 * labeled alternative in {@link SaplingAbtParser#subIpNatPool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpNatPool_Desc(SaplingAbtParser.IpNatPool_DescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipNatPool_Ignore}
	 * labeled alternative in {@link SaplingAbtParser#subIpNatPool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpNatPool_Ignore(SaplingAbtParser.IpNatPool_IgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#ipNatSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpNatSource(SaplingAbtParser.IpNatSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#ipNatDest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpNatDest(SaplingAbtParser.IpNatDestContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#ipNatStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpNatStatic(SaplingAbtParser.IpNatStaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#vpnIpsecPhase1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVpnIpsecPhase1(SaplingAbtParser.VpnIpsecPhase1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#vpnIpsecPhase2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVpnIpsecPhase2(SaplingAbtParser.VpnIpsecPhase2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#ignoreSubCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreSubCommand(SaplingAbtParser.IgnoreSubCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeText(SaplingAbtParser.ZeeTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeWord(SaplingAbtParser.ZeeWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(SaplingAbtParser.EolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaplingAbtParser#zeeWsBOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeeWsBOL(SaplingAbtParser.ZeeWsBOLContext ctx);
}