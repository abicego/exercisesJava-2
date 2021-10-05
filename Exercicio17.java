//17. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius (ºC): ");
        double c = teclado.nextDouble();

        teclado.close();

        double f = c*(9.0/5.0)+32.0;

        System.out.println("A temperatura convertida para Fahrenheit é: " + f);


    }
}
