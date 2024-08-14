//Faça um programa que peça uma nota, entre zero e dez
//Mostre caso o valor seja inválido e continue pedindo até 
//que o usuário informe um valor válido


import java.util.Scanner;

public class Question01 {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in); 

                    boolean notaValida = false;

                    //if(nota >= 0 && nota <=10) { 
                    //          System.out.println("Você digitou " + nota); 
                    //} else { 
                    //          System.out.println("Nota inválida, digite novamente");     
                    //}

                    do { 
                              System.out.print("Informe uma nota");
                              int nota = scan.nextInt();

                              if(nota >=0 && nota <=10) { 
                                        notaValida = true;
                                        System.out.println("Você digitou " + nota); 
                              } else { 
                                        //notaValida = false;
                                        System.out.println("Nota inválida, digite novamente");     
                              }
                    } while(!notaValida);

          }
}
