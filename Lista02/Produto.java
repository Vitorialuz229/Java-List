
import java.util.Scanner;

//Faça um programa que peça dois numeros inteiros e um real
//a) O produto do dobro do primeiro com metade do segundo
//b) A soma do triplo do primeiro com o terceiro 
//c Terceiro elevado ao cubo

public class Produto {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Insira um número inteiro");
                    int numberInt = scan.nextInt();
                    
                    System.out.println("Insira um número inteiro");
                    int numberInt2 = scan.nextInt();

                    System.out.println("Insira um número inteiro");
                    Double numberReal = scan.nextDouble();
                    
                    int Produto = ((numberInt*2) * (numberInt2/2));
                    System.out.println("O produto é " + Produto);

                    Double Soma = ((numberInt*3) + numberReal);
                    System.out.println("A soma é " + Soma);

                    double Cubo = Math.pow(numberReal, 3);
                    System.out.println("O terceiro número ao cubo é " + Cubo);
                    scan.close();

          }

}
