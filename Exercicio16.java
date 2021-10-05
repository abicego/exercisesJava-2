//16. Fazer um programa que recebe três números inteiros em ordem crescente e um quarto número também inteiro que não siga esta regra. Mostra, em seguida, os quatro números em ordem crescente.

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número da ordem crescente: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número da ordem crescente: ");
        int num2 = teclado.nextInt();

        System.out.println("Digite o terceiro número em ordem crescente: ");
        int num3 = teclado.nextInt();

        System.out.println("Digite o quarto número aleatório: ");
        int num4 = teclado.nextInt();

        teclado.close();

        if (num4 > num3){
            System.out.println("A ordem crescente dos números é: " + num1 + ", " + num2 + ", " + num3 + " e " + num4);
        } else if (num4 > num2){
            System.out.println("A ordem crescente dos números é: " + num1 + ", " + num2 + ", " + num4 + " e " + num3);
        } else if (num4 < num1){
            System.out.println("A ordem crescente dos números é: " + num4 + ", " + num1 + ", " + num2 + " e " + num3);
        } else {
            System.out.println("A ordem crescente dos números é: " + num1 + ", " + num4 + ", " + num2 + " e " + num3);
        }


    }
}
