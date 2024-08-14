//Faça um Programa que leia três números e mostre o maior e o menor deles.


import java.util.Scanner;

public class Question07 {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Informe um número");
                    int num1 = scan.nextInt();

                    System.out.println("Informe um número");
                    int num2 = scan.nextInt();

                    System.out.println("Informe um número");
                    int num3 = scan.nextInt();

                    int maior;
                    int menor;

                    switch (num1 > num2 ? num1 : num2) {
                              case 0:
                                        maior = num3;
                                        break;
                              default:
                                        maior = num1 > num2 ? num1 : num2;
                    }

                    switch (maior > num3 ? maior : num3) {
                              case 0:
                                        maior = num2;
                                        break;
                              default:
                                        maior = maior > num3 ? maior : num3;
                    }

                    switch (num1 < num2 ? num1 : num2) {
                              case 0:
                                        menor = num3;
                                        break;
                              default:
                                        menor = num1 < num2 ? num1 : num2;
                    }

                    switch (menor < num3 ? menor : num3) {
                              case 0:
                                        menor = num2;
                                        break;
                              default:
                                        menor = menor < num3 ? menor : num3;
                    }

                    System.out.println("O maior número é: " + maior);
                    System.out.println("O menor número é: " + menor);
                    scan.close();

          }
}
