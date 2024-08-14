
//Faça um Programa que peça a temperatura em graus Farenheit,
//Transforme e mostre a temperatura em graus Celsius

import java.util.Scanner;

public class Temperatura {
          public static void main(String[] args) { 

                    Scanner scan = new Scanner(System.in);

                    System.out.println("Insira a temperatura"); 
                    double temperaturaFarenheit = scan.nextDouble();

                    double temperaturaCelsius = (5* (temperaturaFarenheit - 32)/9);

                    System.out.println("O valor da temperatura em Celsius: " + temperaturaCelsius);

          }
          
}
