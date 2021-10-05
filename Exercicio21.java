//21. Sabe-se que um ano é bissexto se for divisível por 400 ou se for divisível por 4 e não for divisível por 100. Por exemplo: 1988, 1992, 1996, 2020. Determinar se um determinado ano lido é bissexto.

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um ano para saber se ele é bissexto: ");
        int ano = teclado.nextInt();

        teclado.close();

        if (ano%400 == 0){
            System.out.println("O ano " + ano + " é bissexto");
        } else if ((ano%4 == 0) && (ano%100 !=0)){
            System.out.println("O ano " + ano + " é bissexto");
        } else{
            System.out.println("O ano " + ano + " não é bissexto");
        }


    }
    
}
