package Exercicios.aula15.ListaDeExercicios;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto:");
        double produto1 = scan.nextDouble();

        System.out.println("Informe o preço do segundo produto:");
        double produto2 = scan.nextDouble();

        System.out.println("Informe o preço do terceiro produto:");
        double produto3 = scan.nextDouble();

        double produtoMaisBarato;

        if (produto1 <= produto2 && produto1 <= produto3) {
            produtoMaisBarato = produto1;
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            produtoMaisBarato = produto2;
        } else {
            produtoMaisBarato = produto3;
        }

        System.out.println("Você deve comprar o produto que custa " + produtoMaisBarato);
    }
}
