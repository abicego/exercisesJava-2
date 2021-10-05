// 20. Usando switch-case, escrever um programa que lê um inteiro entre 1 e 7 e exibe o dia da semana correspondente a esse número. Isto é, domingo se 1, segunda-feira se 2, e assim por diante.

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para saber seu correspondente em dia da semana:");
        int numero = teclado.nextInt();

        teclado.close();

        switch(numero){
            case 1: System.out.println("O número indica o dia: domingo"); break;
            case 2: System.out.println("O número indica o dia: segunda-feira"); break;
            case 3: System.out.println("O número indica o dia: terça-feira"); break;
            case 4: System.out.println("O número indica o dia: quarta-feira"); break;
            case 5: System.out.println("O número indica o dia: quinta-feira"); break;
            case 6: System.out.println("O número indica o dia: sexta-feira"); break;
            case 7: System.out.println("O número indica o dia: sábado"); break; 
            default: System.out.println("Opção inválida");  
        }

    }
}
