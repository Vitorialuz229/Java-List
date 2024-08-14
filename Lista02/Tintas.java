
import java.util.Scanner;

public class Tintas {
     public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);

          System.out.println("Informe em metros quadrados a area a ser pintada");
          double areaPintada = scan.nextDouble();

          double litrosPintados = areaPintada/3;          
          double qtdLatas = Math.ceil(litrosPintados/18);
          double precoTotal = 80*qtdLatas;
          
          System.out.println("Quantidade de latas de tinta a serem compradas " + qtdLatas);
          System.out.println("Preço das latas de tinta " + precoTotal);
          scan.close();

     }     
}
