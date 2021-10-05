//6. Fazer um programa que recebe três notas, calcula e mostra a média aritmética dessas notas.

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a teceira nota");
        double nota3 = teclado.nextDouble();

        teclado.close();
        
        double media = (nota1 + nota2 + nota3)/3;

        System.out.println("A média de notas é de: " + media);

    }
    
}
