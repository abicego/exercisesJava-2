//9. Fazer um programa que recebe um número positivo, calcula e mostra: a) O número digitado ao quadrado; b) O número digitado ao cubo; c) A raiz quadrada do número digitado. 

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = teclado.nextDouble();

        teclado.close();

        System.out.println("O número " + numero + " elevado ao quadrado é: " + Math.pow(numero,2) +
         ", elevado ao cubo: " + Math.pow(numero,3) + " e sua raíz quadrada: " + Math.sqrt(numero));

    }
    
}
