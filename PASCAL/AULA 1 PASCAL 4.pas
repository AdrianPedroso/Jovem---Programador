Program Pzim ;
 Var
  Aluno: string ;
  Nota1, Nota2, Nota3, media: real ;
Begin
 Writeln (' Nome do aluno ? ') ;
 Readln ( Aluno )               ;
 writeln ('     ')               ;
 Writeln (' Primeira nota ')      ;
 readln ( Nota1 )                  ;
 writeln ('      ')                 ;
 writeln (' Segunda nota ')          ;
 readln ( Nota2 )                     ;
 writeln ('       ')                   ;
 writeln (' Terceira nota ')            ;
 readln ( Nota3 ) ;
 media:= ( (Nota1 + Nota2 + Nota3) / 3)  ;
 write (' A m�dia do aluno ') ;
 write ( Aluno )               ;
 write (' � ')                  ;
 write ( media )                 ;


End.