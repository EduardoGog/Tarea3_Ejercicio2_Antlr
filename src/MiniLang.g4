grammar MiniLang;

programa : instruccion+ EOF ;

instruccion
    : 'let' ID '=' expr NL         # Declaracion
    | ID '=' expr NL               # Asignacion
    | 'print' expr NL              # Imprimir
    | 'if' expr 'then' NL
        instruccion+
      'endif' NL                   # If
    | 'while' expr 'do' NL
        instruccion+
      'endwhile' NL                # While
    ;

expr
    : expr op=('*'|'/') expr       # MulDiv
    | expr op=('+'|'-') expr       # AddSub
    | '(' expr ')'                 # Parentesis
    | NUMERO                       # Literal
    | ID                           # Variable
    ;

NUMERO : [0-9]+ ;
ID     : [a-zA-Z_][a-zA-Z0-9_]* ;
NL     : '\r'? '\n' ;
WS     : [ \t]+ -> skip ;
