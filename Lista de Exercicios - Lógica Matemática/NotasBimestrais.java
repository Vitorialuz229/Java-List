package Exercicios.aula13.ListaExercicios;

import java.util.Scanner;

//Faça um Programa que peça 4 notas bimestrais e mostre a média
public class NotasBimestrais {
          public static void main(String[] args) { 
                    Scanner scan = new Scanner(System.in);
                    
                    System.out.println("Nota do primeiro bimestre");
                    double nota1 = scan.nextDouble();

                    System.out.println("Nota do Segundo bimestre");
                    double nota2 = scan.nextDouble();

                    System.out.println("Nota do Terceiro bimestre");
                    double nota3 = scan.nextDouble();

                    System.out.println("Nota do Quarto bimestre");
                    double nota4 = scan.nextDouble();

                    double media = (nota1 + nota2 + nota3 + nota4)/4;
                    
                    System.out.println("A Média do bimestre " + media);

          }
}         
