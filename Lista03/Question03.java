
import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        while (true) {
            System.out.println("Informe seu nome:");
            nome = scan.next();
            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("Seu nome deve ter mais que 3 caracteres.");
            }
        }

        int idade;
        while (true) {
            System.out.println("Informe sua idade:");
            idade = scan.nextInt();
            if (idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("Você deve ter entre 0 e 150 anos.");
            }
        }

        double salario;
        while (true) {
            System.out.println("Informe seu salário:");
            salario = scan.nextDouble();
            if (salario > 0) {
                break;
            } else {
                System.out.println("A coisa tá difícil, mas não existe salário negativo.");
            }
        }

        String sexo;
        while (true) {
            System.out.println("Informe o seu sexo (M/F):");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                break;
            } else {
                System.out.println("Biologicamente, você deve ser 'M' ou 'F'.");
            }
        }

        String civil;
        while (true) {
            System.out.println("Informe seu estado civil (S/C/V/D):");
            civil = scan.next();
            if (civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v")
                    || civil.equalsIgnoreCase("d")) {
                break;
            } else {
                System.out.println("Você deve informar 'S', 'C', 'V' ou 'D' para estado civil.");
            }
        }

        System.out.println("\nDados informados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + civil);
        scan.close();

    }
}
