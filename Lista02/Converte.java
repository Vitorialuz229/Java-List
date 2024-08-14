
//Faça um programa que converta metros para centimetros

import java.util.Scanner;

public class Converte {
          public static void main(String[] args) { 
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Entre com a quantidade de metros");
                    double metros = scan.nextDouble();

                    //1m = 100 cm
                    double centimetros = metros * 100;

                    System.out.println("Conversão: " + centimetros);


          }
}

