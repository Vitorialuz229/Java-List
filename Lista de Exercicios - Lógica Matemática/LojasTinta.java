package Exercicios.aula13.ListaExercicios;

import java.util.Scanner;

public class LojasTinta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe em metros quadrados a área a ser pintada:");
        double areaPintada = scan.nextDouble();

        double litrosPintados = areaPintada / 6; 

        // Comprar apenas latas de 18 litros
        double qtdLatas = Math.ceil(litrosPintados / 18);
        double precoLatas = 80 * qtdLatas;

        // Comprar apenas galões de 3,6 litros
        double qtdGaloes = Math.ceil(litrosPintados / 3.6);
        double precoGaloes = 25 * qtdGaloes;

        // Misturar latas e galões para o menor preço
        double litrosRestantes = litrosPintados % 18;
        double qtdLatasRestantes = Math.ceil(litrosRestantes / 18);
        double precoLatasRestantes = qtdLatasRestantes * 80;

        double litrosRestantesGaloes = litrosRestantes % 3.6;
        double qtdGaloesRestantes = Math.ceil(litrosRestantesGaloes / 3.6);
        double precoGaloesRestantes = qtdGaloesRestantes * 25;

        double precoTotalMisto = precoLatasRestantes + precoGaloesRestantes;

        System.out.println("Comprar apenas latas de 18 litros:");
        System.out.println("Quantidade de latas: " + qtdLatas);
        System.out.println("Preço: R$" + precoLatas);

        System.out.println("\nComprar apenas galões de 3,6 litros:");
        System.out.println("Quantidade de galões: " + qtdGaloes);
        System.out.println("Preço: R$" + precoGaloes);

        System.out.println("\nMisturar latas e galões para o menor preço:");
        System.out.println("Quantidade de latas restantes: " + qtdLatasRestantes);
        System.out.println("Quantidade de galões restantes: " + qtdGaloesRestantes);
        System.out.println("Preço total: R$" + precoTotalMisto);
    }
}
