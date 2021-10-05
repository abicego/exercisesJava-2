//14. Fazer um programa que recebe dois números e mostra o maior.

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        teclado.close();

        if (num1 > num2 ){
            System.out.println("O maior número digitado foi: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número digitado foi: " + num2);
        } else{
            System.out.println("Os números digitados são iguais");
        }

    }
    
}
