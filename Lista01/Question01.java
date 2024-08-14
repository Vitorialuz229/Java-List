
//Faça um Programa que peça dois números e imprima o maior deles

import java.util.Scanner;

public class Question01 {
          public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              
              System.out.println("Informe um número");
              int num1 = scan.nextInt();
          
              System.out.println("Informe outro número");
              int num2 = scan.nextInt();
          
              if(num1 > num2) { 
                    System.out.println("O número maior é " + num1);
              } else if (num2 > num1) { 
                    System.out.println("O número maior é " + num2);
              }
              scan.close();
          }
}
