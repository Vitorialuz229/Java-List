//Faça um Programa que verifique se uma letra digitada é vogal ou 
//consoante.


import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra:");
        char letra = scan.next().toLowerCase().charAt(0); // Lê a letra como string, converte para minúscula e pega o primeiro caractere

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A letra digitada é uma vogal.");
                break;
            default:
                System.out.println("A letra digitada é uma consoante.");
        }
    }
}
