//Faça um calculo de uma folha de pagamento sabendo que os descontos 

package Exercicios.aula15.ListaDeExercicios;

import java.util.Scanner;

public class Question12 {
       public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          System.out.println("Informe o valor da sua hora");
          int valorHora = scan.nextInt();

          System.out.println("Informe a quantidade de horas trabalhadas no mês");
          int quantHoras = scan.nextInt();

          double salarioBruto = valorHora * quantHoras;
          double IR;

          if(salarioBruto <= 900) {
             IR = 0;       
          } else if(salarioBruto <=1500 ) { 
             IR = 0.05;        
          } else if(salarioBruto <=2500) { 
             IR = 0.1;
          } else { 
             IR = 0.2;       
          }

          double valorIR = salarioBruto *IR;
          double INSS = salarioBruto *0.1;
          double Sindicato = salarioBruto*0.03;
          double FGTS = salarioBruto*0.11;
          double descontos = valorIR + Sindicato + INSS;
          double salarioLiquido = salarioBruto - descontos;

          System.out.println("Salário Bruto: R$" + salarioBruto);
          System.out.println("(-) IR (" + (IR * 100) + "%) : R$" + valorIR);
          System.out.println("(-) INSS (10%): " + INSS);
          System.out.println("FGTS (11%): " + FGTS);
          System.out.println("Total de descontos: " + descontos);
          System.out.println("Salário Liquido: " + salarioLiquido);

       }   
}
