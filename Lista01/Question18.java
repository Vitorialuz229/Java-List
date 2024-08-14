//Faça um Programa que peça uma data no formato dd/mm/aaaa e 
//determine se a mesma é uma data válida

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma data no formato dd/mm/aaaa:");
        String data = scan.nextLine();

        String[] dataParts = data.split("/");
        int dia = Integer.parseInt(dataParts[0]);
        int mes = Integer.parseInt(dataParts[1]);
        int ano = Integer.parseInt(dataParts[2]);

        boolean valida = validarData(dia, mes, ano);

        if (valida) {
            System.out.println("Data Válida");
        } else {
            System.out.println("Data Inválida");
        }
        scan.close();

    }

    public static boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false; // Mês inválido
        }

        if (dia < 1 || dia > 31) {
            return false; // Dia inválido
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30; // Abril, junho, setembro, novembro têm 30 dias
        } else if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                return dia <= 29; // Ano bissexto
            } else {
                return dia <= 28; // Fevereiro em anos não bissextos
            }
        } else {
            return true; // Todos os outros meses têm 31 dias
        }
    }
}
