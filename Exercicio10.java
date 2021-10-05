// 10. Fazer um programa que recebe o preço de um produto, calcula e mostra o novo preço sabendo-se que este sofreu um desconto de 10%.

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valor = (teclado.nextDouble())*0.9;
        teclado.close();

        System.out.println("O preço final com desconto de 10% é " + valor);


    }
}
