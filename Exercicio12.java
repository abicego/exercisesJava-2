//12. Fazer um programa que recebe o salário de um funcionário e o percentual de aumento, calcula e mostra o valor do aumento e o novo salário.

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");
        double salario = teclado.nextDouble();
        
        System.out.println("Digite o percentual de aumento: ");
        double porcentagem = teclado.nextDouble();
        double aumento = porcentagem/100;

        teclado.close();

        double salarioFinal = (salario * aumento) + salario;
        String result = String.format("%.2f", salarioFinal);


        System.out.println("O salário de R$" + salario +
            " com o aumento de " + porcentagem + "% resulta em: R$" + result);
        
    }
    
}
