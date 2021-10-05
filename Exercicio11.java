// 11. Fazer um programa que recebe o salário-base de um funcionário, calcula e mostra o salário a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o salário-base.

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o salário base");
        double salario = teclado.nextDouble();

        teclado.close();

        double gratificacao = salario * 1.05;
        double desconto = salario * 0.7;

        double salarioFinal = (gratificacao + desconto) - salario;

        System.out.println("O salário final é: " + salarioFinal);
    }
}
