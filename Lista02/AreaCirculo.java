

import java.util.Scanner;

//Faça um programa que peça o raio de um circulo, calcule e mostre sua área

public class AreaCirculo {
          public static void main(String[] args) { 

          System.out.println("Entre com a quantidade do raio");
          Scanner scan = new Scanner(System.in);

         double raio = scan.nextFloat();

         double area = Math.PI * Math.pow(raio, 2);
         
         System.out.println("O valor da area é = " + area);
         scan.close();

      }
}
          

