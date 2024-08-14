package Exercicios.aula13.ListaExercicios;

import java.util.Scanner;

public class JoaoPapodePescador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Informe o peso do peixe pesacado"); 
        double pesoTotal = scan.nextDouble();
        double multa = 0;

        if( pesoTotal > 50) { 
           double pesoExcedente = pesoTotal - 50; 
                  multa = pesoExcedente * 4.00;       
        } 
        System.out.println("Multa a ser paga: R$" + multa);
    }      
}
