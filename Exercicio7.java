//7. Fazer um programa que calcula e mostra a área de um triângulo, sabendo que: área = (base * altura) / 2.

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base do triângulo");
        double base = teclado.nextDouble();

        System.out.println("Digite a altura do triângulo");
        double altura = teclado.nextDouble();
        
        teclado.close();

        double area = (base * altura)/2;

        System.out.println("A área do triângulo: " + area);
        
    }
}
