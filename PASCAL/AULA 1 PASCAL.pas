Program Pzim ;
Var
 A, B, C, Area, Circulo: Real ;
Begin
writeln (' Qual o primeiro valor ? ')   ;
readln ( A )                             ;
Writeln (' ')                             ;
writeln (' Qual segundo valor ? ')         ;
readln ( B )                                ;
writeln (' ')                                ;
writeln (' Qual o terceiro valor ? ')         ;
readln ( C )                                   ;
writeln (' ')                                   ;
Area:= ( ( A * C ) / 2 )                        ;
write (' O valor da area do triangulo é ');
write ( Area ) ;
Circulo:= ( 3.14 * C^2)           ;
write (' O valor do circulo é ')   ;
write ( Circulo)                    ;

End.