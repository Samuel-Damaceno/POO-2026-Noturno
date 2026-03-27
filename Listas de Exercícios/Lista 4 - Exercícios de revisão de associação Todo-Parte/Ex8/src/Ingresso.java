public class Ingresso {
    private int id;
    public enum TipoIngresso {
        INTEIRA,
        MEIA
    }
    private TipoIngresso tipo;
    private float preco;
    private String assento;

    public Ingresso() {
    }

    public Ingresso(int id, float preco, TipoIngresso tipo, String assento) {
        this.id = id;
        this.preco = preco;
        this.tipo = tipo;
        setAssento(assento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", preco=" + preco +
                ", assento='" + assento + '\'' +
                '}';
    }
}
