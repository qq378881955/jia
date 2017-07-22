grammar Hello;               // 定义语法的名字
a	: s*;
s  : 'hello' ID INT NEWLINE;            // 匹配关键字hello，后面跟着一个标志符
ID : [a-z]+ ;  
INT : [0-9]+;
NEWLINE	: '\r' '\n'?
        | '\n'
        ;
WS : [ \t\r\n]+ -> skip ;  