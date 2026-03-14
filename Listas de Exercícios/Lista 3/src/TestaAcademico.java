public class TestaAcademico {
    public static void main() {
        Aluno al1 = new Aluno(1, "Samuel", "12345");
        Aluno al2 = new Aluno(2, "Rafaela", "56789");
        Disciplina dis = new Disciplina(1, "Programação Orientada a Objetos", "Dããããniel");

        dis.matricularAluno(al1);
        dis.matricularAluno(al2);
        dis.criarAvaliacao(1, "Prova Semestral");

        Avaliacao av = dis.getAvaliacao().get(0);

        av.adicionarQuestao(1, 1, "Você veio nas aulas?", 1);
        av.adicionarQuestao(2, 2, "Fez todas as atividades propostas?", 2);
        av.adicionarQuestao(3, 3, "Acha que vai sair bem na prova?", 7);

        System.out.println(dis.toString());
    }
}