//Faça um programa que leia um nome de usuário e a sua senha e não
//aceite a senha igual ao nome do usuario, mostrando uma mensagem
//de erro e voltando a pedir as informações

package Exercicios.aula17.ListaExercicios;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome_usuario;
        String senha;
        while (true) {
            System.out.print("Informe seu nome: ");
            nome_usuario = scan.next();
            
            System.out.print("Informe uma senha: ");
            senha = scan.next();
            
            if (senha.equals(nome_usuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário");
            } else {
                System.out.println("Senha aceita com sucesso");
                break; 
            }                           
        }

        scan.close(); 
    }
}
