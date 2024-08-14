//Tendo com dados de entrada a altura de uma pessoa construa um algoritmo
//que calcule seu peso ideal 


import java.util.Scanner;

public class AlturaIdeal {
          public static void main(String[] args) {
                    
                    Scanner scan = new Scanner(System.in);
                    
                    System.out.println("Informe sua altura");
                    double Altura = scan.nextInt();

                    double PesoIdeal = ((72.7 * Altura) - 58);
                    System.out.println("O seu peso ideal é " + PesoIdeal);
          }
}
