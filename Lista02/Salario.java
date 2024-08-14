
//Faça um programa que pergunte quanto você ganha por hora e o número de horas que você trabalha

import java.util.Scanner;

public class Salario {
         public static void main(String[] args) { 

          Scanner scan = new Scanner(System.in);

          System.out.println("Entre com o valor da sua hora");
          double valorHora = scan.nextDouble();

          System.out.println("Quantas horas você trabalha?");
          double horas = scan.nextDouble();

          double salario =  valorHora * horas; 

          System.out.println("O valor total do seu salário: " + salario);
          scan.close();       
          } 
}
