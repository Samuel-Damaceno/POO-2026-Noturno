//Classe filha de Veiculo

public class CarroEletrico extends Veiculo{
    private int autonomiaBateria;

    public CarroEletrico() {
    }

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        if (autonomiaBateria >= 0) {
            this.autonomiaBateria = autonomiaBateria;
        } else {
            this.autonomiaBateria = 0;
        }
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                super.toString()+
                "autonomiaBateria=" + autonomiaBateria +
                '}';
    }

    //Metodos personalizados (@Override 'mover', 'abastecer'

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente a "+this.velocidade+" Km/h");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria com capacidade de "+this.autonomiaBateria+" em posto de carga rápida");
    }
}
