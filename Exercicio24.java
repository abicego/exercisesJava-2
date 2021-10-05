//24. Ler um número inteiro entre 1 e 20 e exibir sua tabuada. Utilize os 3 comandos de laço de repetição, para praticar.

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 20 para saber sua tabuada: ");
        int num = sc.nextInt();

        sc.close();

    /*
    *    for (int i = 0; i<=20; i++){
    *        int tabuada = num*i;
    *        System.out.println(num + "x" + i + "=" + tabuada);
    *    }
    */

    /*
    *    int i = 0;
    *    while ( i <= 20){
    *        int tabuada = num*i;
    *        System.out.println(num + "x" + i + "=" + tabuada);
    *
    *        i++;
    *    }
    */

        if(num <=20){
            int i=0;
            do{
                int tabuada = num*i;
                System.out.println(num + "x" + i + "=" + tabuada);
                i++;
            } while (i<=20);
        } else{
            System.out.println("Ops! Número inválido. Tente de novo!");
        }

    }
}