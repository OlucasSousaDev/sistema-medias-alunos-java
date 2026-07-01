public class Verificacao {
    static String aprovadoReprovado(){
        double resultFinal =  CalcularMedia.media();
        if(resultFinal>= 6.0 && resultFinal<10.1){
            System.out.println("---ALUNO APROVADO---");
        }
        else if(resultFinal == 5.0){
            System.out.println("---ALUNO DE RECUPERAÇÃO---");

        }
        else{
            System.out.println("---ALUNO REPROVADO---");
        }
        return " ";
    }
}
