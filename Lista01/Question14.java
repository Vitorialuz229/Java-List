//Faça um programa que lê as notas parciais obtidas por um aluno


import java.util.Scanner;

public class Question14 {
          public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);

              System.out.println("Informe a primeira nota");
              int nota1 = scan.nextInt();
          
              System.out.println("Informe a segunda nota");
              int nota2 = scan.nextInt();

              double media = (nota1 + nota2)/2;

              if (media >= 9.0 && media <= 10.0) {
                    System.out.println("A");
                } else if (media >= 7.5 && media < 9.0) {
                    System.out.println("B");
                } else if (media >= 6.0 && media < 7.5) {
                    System.out.println("C");
                } else if (media >= 4.0 && media < 6.0) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }

                if (media >= 6.0) {
                    System.out.println("APROVADO");
                } else {
                    System.out.println("REPROVADO");
                }
          }
}
