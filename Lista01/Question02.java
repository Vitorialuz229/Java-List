//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

import java.util.Scanner;

public class Question02 {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    
                    System.out.println("Informe um número");
                    double valor = scan.nextDouble(); 
                    
                    if(valor < 0) { 
                              System.out.println("Número Negativo");
                    }else { 
                              System.out.println("Número Positivo");

                    }
          }
}
