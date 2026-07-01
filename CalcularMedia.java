import java.util.Scanner;
public class CalcularMedia {
    static Scanner sc = new Scanner(System.in);
    static double media(){
        double media;
        System.out.println("==DIGITE A NOTA N1==");
        double nota1 = sc.nextDouble();
        System.out.println("==DIGITE A NOTA N2==");
        double nota2 = sc.nextDouble();
        System.out.println("==DIGITE A NOTA N3==");
        double nota3 = sc.nextDouble();
        System.out.println("==DIGITE A NOTA N4==");
        double nota4 = sc.nextDouble();
        System.out.println("==DIGITE A NOTA N5==");
        double nota5 = sc.nextDouble();
        media = (nota1+nota2+nota3+nota4+nota5)/5;
        return  media;
    }
}
