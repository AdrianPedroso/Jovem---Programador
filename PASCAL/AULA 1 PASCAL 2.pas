Program Pzim ;
Var
Cliente, Produto: string ;
Quantidade, Preco, Total: Real ;

Begin
writeln (' Nome do cliente ? ')                ;
Readln ( Cliente )                              ;
writeln (' ')                                    ;
Writeln (' Qual produto ele comprou ? ')          ;
readln ( Produto )                                 ;
writeln (' ')                                       ;
writeln (' Qual valor ? ')                           ;
readln ( Preco )                                      ;
writeln ( ' ' )                                        ;
writeln (' Quantos produtos ele comprou ? ')            ;
readln ( Quantidade )                                    ;
writeln (' ')                                             ;
Total:= ( Quantidade * Preco )                             ;
writeln (' ')                                               ;
write (' O cliente ')                                        ;
write ( Cliente )                                             ;
write (' comprou ')                                            ;
write ( Quantidade )                                           ;
write (' ')                                                     ;
write ( Produto )                                                ;
write (' que custou ')                                            ;
write ( Total )                                                            
End.                                                                