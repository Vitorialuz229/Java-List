
import java.util.Scanner;

public class Question16 {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Informe o valor de A");
                    int A = scan.nextInt();

                    if (A == 0) {
                              System.out.println("A equação não é do segundo grau (A deve ser diferente de zero).");
                    } else {
                              System.out.println("Informe o valor de B");
                              double B = scan.nextInt();

                              System.out.println("Informe o valor de C");
                              double C = scan.nextInt();

                              double delta = B * B - 4 * A * C;

                              if (delta > 0) {
                                        double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
                                        double raiz2 = (-B + Math.sqrt(delta)) / (2 * A);
                                        System.out.println("Raiz 1: " + raiz1);
                                        System.out.println("Raiz 2: " + raiz2);
                              } else if (delta == 0) {
                                        double raiz = -B / (2 * A);
                                        System.out.println("A equação possui uma única raiz: " + raiz);
                              } else {
                                        System.out.println("A equação não possui raízes reais.");
                              }
                    }
          }

}
