// 1. Sabendo que A=3, B=7 e C=4, informe se as expressões abaixo são verdadeiras ou falsas: a) (A+C) > B ; b) B >= (A + 2) ; c) C == (B –A) ; d) (B + A) <= C ; e) (C+A) > B. 
public class Exercicio1 {

    public static void main(String[] args){
        int a=3;
        int b=7;
        int c=4;

        System.out.println((a+c)>b);
        System.out.println(b>=(a+2));
        System.out.println(c==(b-a));
        System.out.println((b+a)<=c);
        System.out.println((c+a)>b);
    }
    
}
