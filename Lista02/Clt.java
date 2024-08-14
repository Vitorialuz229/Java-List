
import java.util.Scanner;

public class Clt {
       public static void main(String[] args) {
       
          Scanner scan = new Scanner(System.in);

          System.out.println("Entre com o valor da sua hora");
          double valorHora = scan.nextDouble();

          System.out.println("Quantas horas você trabalha?");
          double horas = scan.nextDouble();

          double salarioBruto =  valorHora * horas; 
          
          double inss = salarioBruto*0.08;
          double sindicato = salarioBruto *0.05;
          double IR = salarioBruto*0.11;
          double totalDesconto = IR + inss + sindicato; 
          double salarioLiquido = salarioBruto - totalDesconto;

          System.out.println("O valor total do seu salário: " + salarioBruto);
          System.out.println("O valor total pago para o INSS " + inss);
          System.out.println("O valor total pago para o sindicato: " + sindicato);
          System.out.println("O valor total pago para o IR: " + IR);
          System.out.println("O valor total de desconto: " + totalDesconto);
          System.out.println("O valor total do seu salário: " + salarioLiquido);
          
         } 
}
