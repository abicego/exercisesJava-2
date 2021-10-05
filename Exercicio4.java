// 4. Tendo como dados de entrada a altura (h) e o sexo de uma pessoa (um caracter m ou f), construir um programa que calcula seu peso ideal, utilizando as seguintes fórmulas: Para homens: (72.7*h) - 58; Para mulheres: (62.1*h) - 44.7
import javax.swing.JOptionPane;

public class Exercicio4 {
    
    public static void main(String[] args){

        char genero = JOptionPane.showInputDialog("Digite seu gênero sendo F para feminino e M para masculino").charAt(0);
        genero -= 32; //Deixar char em uppercase
        double h = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        double peso = 0;

        if (genero == 'F'){
            peso = (62.1*h) - 44.7;

            System.out.println("Considerando seu gênero feminino (" + genero + "), seu peso ideal é: " + peso + "Kg");      } else if (genero == 'M'){
            peso = (72.7*h) - 58;
            System.out.println("Considerando seu gênero feminino (" + genero + "), seu peso ideal é: " + peso + "Kg");
        } else{
            System.out.println("Você digitou algo errado. Tente de novo!");
        }
        
    }
}
