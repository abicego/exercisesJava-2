//22. Escreva um programa em Java que mostra todos os números pares de 1 a 100.


public class Exercicio22 {

    public static void main(String[] args){

        for (int i=0; i<=100; i++){

            if (i%2==0){
                System.out.print(i);
            } else {                                 //Else é opcional
                System.out.print("-");
            }
            
            
        }

    }

}
