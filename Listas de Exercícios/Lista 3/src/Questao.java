public class Questao {
    private int id;
    private int numero;
    private String enunciado;
    private float valor;

    public Questao(int id, int numero, String enunciado, float valor) {
        this.id = id;
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public Questao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Questao{\n" +
                "id=" + id +
                "\nnumero=" + numero +
                "\nenunciado='" + enunciado + '\'' +
                "\nvalor=" + valor +
                '}';
    }
}
