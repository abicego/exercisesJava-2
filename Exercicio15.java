//15. Fazer um programa que recebe três números e mostra-os em ordem crescente.

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Sigite o teceiro número: ");
        int num3 = teclado.nextInt();

        teclado.close();

        if ((num1 > num2) && (num1 > num3) && (num2> num3)){
            System.out.println("A ordem crescente dos número digitados é: " + num1 + ", " + num2 + " e " + num3);
        } else if ((num1 > num2) &&(num1 > num3) && (num2< num3)){
            System.out.println("A ordem crescente dos número digitados é: " + num1 + ", " + num3 + " e " + num2);
        } else if ((num2 > num1) && (num2 > num3) && (num1 > num3)){
            System.out.println("A ordem crescente dos número digitados é: " + num2 + ", " + num1 + " e " + num3);
        } else if ((num2 > num1) && (num2 > num3) && (num1 < num3)){
            System.out.println("A ordem crescente dos número digitados é: " + num2 + ", " + num3 + " e " + num1);
        }else if ((num3 > num2) && (num2 > num1) && (num3 > num1)){
            System.out.println("A ordem crescente dos número digitados é: " + num3 + ", " + num2 + " e " + num1);
        } else {
            System.out.println("A ordem crescente dos número digitados é: " + num3 + ", " + num1 + " e " + num2);
        }
    }
}
