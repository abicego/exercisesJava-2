//5. Fazer um programa que recebe três números inteiros, calcula e mostra a soma desses números

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);;

        System.out.println("Digite um número inteiro: ");        
        int numero1 = teclado.nextInt();

        System.out.println("Digite outro número: ");        
        int numero2 = teclado.nextInt();

        System.out.println("Digite o último número: ");        
        int numero3 = teclado.nextInt();

        teclado.close();

        int soma = numero1 + numero2 + numero3;

        System.out.println("A soma dos três números é de: " + soma);

        
    }
}
