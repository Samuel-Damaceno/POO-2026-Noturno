public class Aluno {
    private int id;
    private String nome;
    private String ra;

    public Aluno(int id, String nome, String ra) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
    }

    public Aluno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("Id inválido.");
            this.id = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{\n" +
                "id=" + id +
                "\nnome='" + nome + '\'' +
                "\nra='" + ra + '\'' +
                '}';
    }
}
