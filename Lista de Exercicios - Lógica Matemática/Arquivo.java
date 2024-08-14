package Exercicios.aula13.ListaExercicios;

import java.util.Scanner;

public class Arquivo {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Informe o tamanho de um arquivo para download");
                    double arquivo = scan.nextDouble();

                    System.out.println("Informe a velocidade de um link de Internet");
                    double velocidade = scan.nextDouble();

                    double tempo = arquivo / velocidade; 

        System.out.println("O tempo aproximado de download é de " + tempo);
    }
}
