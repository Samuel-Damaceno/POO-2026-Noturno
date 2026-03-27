import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> aps = new ArrayList<Apartamento>();

    public Edificio() {
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Apartamento> getAps() {
        return aps;
    }

    public void setAps(ArrayList<Apartamento> aps) {
        this.aps = aps;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", aps=" + aps +
                '}';
    }

    private void adicionaApartamento(Apartamento ap) {
        if (!this.aps.contains(ap)) {
            this.aps.add(ap);
        }
    }

    public void construirApartamento(int num, int andar) {
        Apartamento ap = new Apartamento(num, andar);
        adicionaApartamento(ap);
    }
}
