import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
    }

    public Disciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAluno() {
        return alunos;
    }

    public void matricularAluno(Aluno a) { //Agregação - aluno vem de fora, existe fora da disciplina e é vinculado a ela.
        this.alunos.add(a);
    }

    public ArrayList<Avaliacao> getAvaliacao() {
        return avaliacoes;
    }

    public void criarAvaliacao(int id, String nome) {
        Avaliacao avaliacao = new Avaliacao(id, nome);
        this.avaliacoes.add(avaliacao);
    }

    @Override
    public String toString() {
        return "Disciplina{\n" +
                "id=" + id +
                "\nnome='" + nome + '\'' +
                "\nprofessor='" + professor + '\'' +
                "\nalunos=" + alunos +
                "\navaliacoes=" + avaliacoes +
                '}';
    }
}
