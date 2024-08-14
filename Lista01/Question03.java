
//Faça um programa que verifique se uma letra digitada
//'F' ou 'M' para feminino e masculino e qualquer outra letra para sexo inválido

import java.util.Scanner;

public class Question03 {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in); 

                    System.out.println("Informe o seu sexo"); 
                    int sexo = scan.nextInt(); 

                    if(sexo == 'F' && sexo == 'f') { 
                              System.out.println("Sexo feminino"); 
                    } else if(sexo == 'M' && sexo == 'm') { 
                              System.out.println("Sexo masculino");
                    } else { 
                              System.out.println("Sexo Inválido");
                    }
                    scan.close();

          }
         

}
