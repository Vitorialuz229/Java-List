//Faça um programa que pergunta em que turno você estuda
//Peça para digitar M-masculino ou V-Vespertino ou N-Noturno
//Imprima 'Bom Dia', 'Boa Tarde' e 'Boa Noite' ou 'Valor Invalido'


import java.util.Scanner;

public class Question10 {
          public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                
                System.out.println("Informe o turno estudado (M-m para matutino, V-v para vespertino):");
                char turno = scan.next().charAt(0);
        
                if (turno == 'm' || turno == 'M') {
                    System.out.println("Bom Dia");
                } else if (turno == 'v' || turno == 'V') {
                    System.out.println("Boa Tarde");
                } else {
                    System.out.println("Valor Inválido");
                }
            }
        }