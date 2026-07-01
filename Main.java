import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==SISTEMA DE MÉDIA DE ALUNOS==");
        System.out.println("/DIGITE O NOME DO ALUNO/");
        String nomeAluno = sc.nextLine();
        System.out.println("/DIGITE A TURMA/");
        String turma = sc.nextLine();
        System.out.println("/DIGITE O TURNO DO ALUNO/");
        String turno = sc.nextLine();

        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
        CalcularMedia.media();
        Verificacao.aprovadoReprovado();
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        
        sc.close();
    }
}