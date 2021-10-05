//26. Exibir todos os divisores de um número inteiro positivo lido.

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber seus divisores: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println("Os divisores de " + num + " são os números: ");
        for (int i = 1; i<=9; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    
}
