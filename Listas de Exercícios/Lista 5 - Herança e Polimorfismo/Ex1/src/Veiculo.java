//Classe pai de 'Aviao' e 'CarroEletrico'

public class Veiculo {
    protected String marca, modelo;
    protected float velocidade;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        setVelocidade(velocidade);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            this.velocidade = 0;
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    //Métodos personalizados ('mover' e 'abastecer')

    public void mover() {
        if (this.velocidade > 0) {
            System.out.println("O veiculo está se movendo a "+this.velocidade+"Km/h");
        } else {
            System.out.println("Não é possivel se mover na velocidade atual ("+this.velocidade+"Km/h)");
        }
    }

    public void abastecer(){
        System.out.println("Veiculo abastecendo...");
    }
}
