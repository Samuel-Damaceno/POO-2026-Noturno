public class AlunoTeste {
    public static void main(String[] args){
        Aluno Aluno1 = new Aluno("Saulo", 4, 6);
        Aluno Aluno2 = new Aluno("Saci", 8, 9);

        Aluno1.exibirInformacoes();
        System.out.println("=====");
        Aluno2.exibirInformacoes();
    }
}
