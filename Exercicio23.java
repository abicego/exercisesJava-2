/*23. Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado
daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com lados de
todos os tamanhos entre 1 e 20. Exemplo para lado igual a 5:
*****
*****
*****
*****
*****
*/

import java.util.Scanner;

public class Exercicio23 {
    
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        int lado = teclado.nextInt();

        teclado.close();

        if (lado <= 20){
            
            for(int i=0; i < lado; i++){ //não é <= pq o i começa com zero

                for(int j = 0; j < lado; j++){
                    System.out.print("*");  //usar print para ser tudo a mesma linha (println é cada resutlado numa linha)
                } 
                System.out.println(); // pula linha
            } 

        }

    }
}

/* Outra solução
            for(int i=0; i < quad; i++){
                System.out.println("*".repeat(quad));
            }
*/