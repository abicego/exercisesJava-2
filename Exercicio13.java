/*
13. A nota final de um estudante é calculada a partir de três notas atribuídas respectivamente
a um trabalho de laboratório, à avaliação semestral e a um exame final. A média das três notas
mencionadas anteriormente obedece aos pesos a seguir:
NOTA PESO
Trabalho de laboratório 2
Avaliação semestral 3
Exame final 5
*/

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório: ");
        double notaLab = (teclado.nextDouble())*2;

        System.out.println("Digite a nota da avaliação semestral: ");
        double notaAva = (teclado.nextDouble())*3;

        System.out.println("Digite a nota do exame final: ");
        double notaExa = (teclado.nextDouble())*5;

        teclado.close();

        double media = (notaLab + notaAva + notaExa)/3;

        System.out.println("A média final é: " + media);
    }
    
}
