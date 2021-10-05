//18. Ler um valor em real e a cotação do dólar. Em seguida, exibir o valor correspondente em dólares.

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] arg){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valro em reais: ");
        double real = teclado.nextDouble();

        teclado.close();

        double dolar = real * 5.47;

        System.out.println("A conversão de real para dólar ($5,47) é: " + dolar);

    }
}
