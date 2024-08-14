//Peça 3 lados de um triângulo, indique, caso os lados 
//Formem um triângulo se equilátero, isósceles ou escaleno


import java.util.Scanner;

public class Question15 {
        public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);

          System.out.println("Digite o lado 1 do triângulo");
              int ladoD = scan.nextInt();
          System.out.println("Digite o lado 2 do triângulo");
              int ladoE = scan.nextInt();
          System.out.println("Digite o lado 3 do triângulo");
              int ladoC = scan.nextInt();  
              
              if (ladoD + ladoE > ladoC && ladoD + ladoC > ladoE && ladoE + ladoC > ladoD) {
                    if (ladoD == ladoE && ladoD == ladoC) {
                        System.out.println("Triângulo Equilátero");
                    } else if (ladoD == ladoE || ladoD == ladoC || ladoE == ladoC) {
                        System.out.println("Triângulo Isósceles");
                    } else {
                        System.out.println("Triângulo Escaleno");
                    }
                } else {
                    System.out.println("Os lados fornecidos não formam um triângulo válido.");
                }
                scan.close();

            }
        }