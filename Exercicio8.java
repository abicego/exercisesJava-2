// 8. Fazer um programa que calcula e mostra a área de um círculo, sabendo que: área = pi * r2.

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = teclado.nextDouble();

        teclado.close();

        double area = Math.PI * Math.pow(raio,2);
        System.out.println("A área do círculo é: " + area);


    }
    
}
