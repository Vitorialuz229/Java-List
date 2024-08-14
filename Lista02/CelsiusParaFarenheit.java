
//Faça um programa que peça a temperatura em graus Celsius, 
//transforme e mostre em graus farenheit

import java.util.Scanner;

public class CelsiusParaFarenheit {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Insita a temperatura em Celsius");
                    double temperaturaCelsius = scan.nextDouble();
          
                    double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;
                    
                    System.out.println("O valor da temperatura em Farenheit " + temperaturaFarenheit);  
          }

         
}
