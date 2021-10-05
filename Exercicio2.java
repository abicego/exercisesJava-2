//2. Sabendo que A=5, B=4, C=3 e D=6, informe se as expressões abaixo são verdadeiras ou falsas: a) (A > C) && (C <= D); b) (A+B) > 10 || (A+B) == (C+D); c) (A>=C) && (D >= C); 

public class Exercicio2 {
    public static void main(String[] args){
        int a=5;
        int b=4;
        int c=3;
        int d=6;

        System.out.println((a>c)&&(c<=d));
        System.out.println((a+b)>10 ||(a+b)==(c+d));
        System.out.println((a>=c)&&(d>=c) );

    }
}
