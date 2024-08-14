package Exercicios.aula13.ListaExercicios;

import java.util.Scanner;

public class PesoSexo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua altura");
        double altura = scan.nextDouble();

        System.out.println("Informe seu sexo M para masculino e F para feminino");
        char sexo = scan.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino");
            scan.close();
            return;
        }

        System.out.print("Digite o peso atual em kg: ");
        double pesoAtual = scan.nextDouble();

        if (pesoAtual < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (pesoAtual > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está dentro do peso ideal.");
        }

        scan.close();
    }
}
