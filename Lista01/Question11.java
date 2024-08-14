/*Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento."*/


import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salario do trabalhador");
        int salario = scan.nextInt();

        double aumento;
        double percentual;
        double novo_salario;

        if (salario <= 280) {
            percentual = 0.2; 
        } else if (salario > 280 && salario <= 700) {
            percentual = 0.15; 
        } else if (salario > 700 && salario <= 1500) {
            percentual = 0.1;
        } else {
            percentual = 0.05; 
        }

        aumento = salario * percentual;
        novo_salario = salario + aumento;

        System.out.println("Salario original: " + salario);
        System.out.println("O percentual de aumento aplicado: " + (percentual * 100) + '%'); 
        System.out.println("O valor do aumento: " + aumento); 
        System.out.println("O novo salário, após o aumento: " + novo_salario);

        scan.close();

    }      
}
