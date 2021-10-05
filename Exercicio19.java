//19. Ler um número inteiro e exibir o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercicio19 {
    
    public static void main (String[] args){

       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();

        teclado.close();

        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.println("O número digitado é: " + numero + ", seu antecessor " + antecessor + " e sucessor " + sucessor);

    }

}
