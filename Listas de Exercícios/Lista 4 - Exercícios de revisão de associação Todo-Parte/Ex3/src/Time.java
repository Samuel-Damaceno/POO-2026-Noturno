import java.util.ArrayList;

public class Time {
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> membros = new ArrayList<Atleta>();

    public Time() {
    }

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Atleta> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Atleta> membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                '}';
    }

    public void contratarAtleta(Atleta a) {
        this.membros.add(a);
    }

    public void demitirAtleta(Atleta a) {
        this.membros.remove(a);
    }
}
