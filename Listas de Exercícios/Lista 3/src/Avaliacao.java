import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    ArrayList<Questao> questoes= new ArrayList<Questao>();

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Avaliacao() {
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

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public void adicionarQuestao(int id, int num, String texto, float peso) {
        Questao questao = new Questao(id, num, texto, peso);
        this.questoes.add(questao);
    }

    @Override
    public String toString() {
        return "\nAvaliacao{\n" +
                "id=" + id +
                "\nnome='" + nome + '\'' +
                "\nquestoes=" + questoes +
                '}';
    }
}
