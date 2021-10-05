// 3. Ler um número e verificar se ele é par ou ímpar.

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));

        if ((numero%2)==0){
            System.out.println("O número " + numero + " é par");
        }
        
        else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }
}
