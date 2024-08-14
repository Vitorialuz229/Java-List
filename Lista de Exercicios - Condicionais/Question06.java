//Faça um Programa que leia três números e mostre o maior deles.

package Exercicios.aula15.ListaDeExercicios;

import java.util.Scanner;

public class Question06 {
          public static void main(String[] args) {
                  Scanner scan = new Scanner(System.in);
                  
                  System.out.println("Informe um número");
                  int num1 = scan.nextInt();

                  System.out.println("Informe um número");
                  int num2 = scan.nextInt();

                  System.out.println("Informe um número");
                  int num3 = scan.nextInt();

                  int maior; 

                  switch (num1 > num2 ? num1 : num2) {
                    case 0:
                        maior = num3;
                        break;
                    default:
                        maior = num1 > num2 ? num1 : num2;
                }
        
                switch (maior > num3 ? maior : num3) {
                    case 0:
                        maior = num2;
                        break;
                    default:
                        maior = maior > num3 ? maior : num3;
                }
        
                System.out.println("O maior número é: " + maior);
            }
        }
