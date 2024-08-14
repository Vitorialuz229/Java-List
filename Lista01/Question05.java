/*Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:
- A mensagem "Aprovado", se a média alcançada for maior ou 
igual a sete;
- A mensagem "Reprovado", se a média for menor do que sete;
- A mensagem "Aprovado com Distinção", se a média for igual a 
dez.*/


import java.util.Scanner;

public class Question05 {
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          System.out.println("Informe a nota da primeira prova");
          int nota1 = scan.nextInt();

          System.out.println("Informe a nota da primeira prova");
          int nota2 = scan.nextInt();

          int media = (nota1 + nota2)/2;

          if(media == 10) { 
                    System.out.println("Aprovado com Distinção");
          } else if(media >= 7) { 
                    System.out.println("Aprovado");                 
          } else { 
                    System.out.println("Reprovado");
          }
      }    
}
