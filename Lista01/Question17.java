//Faça um programa que peça um número corresponde a um determinado
//ano e em seguida informe se este ano é ou não bissexto


import java.util.Scanner;

public class Question17 {
      public static void main(String[] args) {    
          Scanner scan = new Scanner(System.in);

          System.out.println("Informe um ano"); 
          int ano = scan.nextInt();

          if(ano % 4 == 0 && ano % 100!= 0) { 
                    System.out.println("Bissexto");
          } else if(ano % 400 == 0) { 
                    System.out.println("Bissexto");
          } else { 
                    System.out.println(" Não é Bissexto");     
          }
      }    
}
