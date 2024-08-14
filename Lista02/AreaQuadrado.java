
//Faça um Programa que calcule a área de um quadrado,
//em seguida mostre o dobro desta área para o usuário

import java.util.Scanner;

public class AreaQuadrado {
         public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);

          System.out.println("Insira o valor do lado");
          double lado = scan.nextDouble();

          //area = lado * lado
          double area = lado * lado;

          System.out.println("O valor da área: " + area);
          System.out.println("O valor da área ao dobro: " + (area * 2));
          scan.close();

         } 
}
