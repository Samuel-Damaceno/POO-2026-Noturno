//Classe filha de Veiculo

public class Aviao extends Veiculo{
    private float altitudeMax, altitudeAtual;

    public Aviao() {
    }

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax, float altitudeAtual) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
        this.altitudeAtual = altitudeAtual;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeAtual() {
        return altitudeAtual;
    }

    public void setAltitudeAtual(float altitudeAtual) {
        if (altitudeAtual <= this.altitudeMax && altitudeAtual <=0) {
            System.out.println("Alterando altidude atual de "+this.altitudeAtual+" metros para "+altitudeAtual+" metros!");
            this.altitudeAtual = altitudeAtual;
        } else {
            System.out.println("Altitude inválida! Retornando ao solo...");
            this.altitudeAtual = 0;
        }
    }

    @Override
    public String toString() {
        return "Aviao{" +
                super.toString()+
                "altitudeMax=" + altitudeMax +
                ", altitudeAtual=" + altitudeAtual +
                '}';
    }

    //Metodos personalizados (@Override 'mover' e 'abastecer'

    @Override
    public void mover() {
        if (this.velocidade > 0 && this.altitudeAtual >=0) {
            System.out.println("Avião voando a "+this.velocidade+"Km/h em uma altitude de "+this.altitudeAtual+" metros");
        } else {
            System.out.println("Não é possivel se mover na velocidade atual ("+this.velocidade+"Km/h)");
        }
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
    }
}
