import java.util.Random;

public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){

    }

    public ArCondicionado(int temperatura, String marca, String modelo) {
        setTemperatura(temperatura);
        setMarca(marca);
        this.modelo = modelo;
    }

    //Setters

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura fora da faixa");
            this.temperatura = 0;
        }
    }

    public  void setMarca(String marca) {
        if (marca.length() >= 3) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida");
            this.marca = "AAA";
        }
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Modo Turbo ativado.");
        } else {
            System.out.println("Não foi possivél ativar o Modo Turbo: Compressor Debilitado");
        }
    }

    private boolean verificarCompressor() {
        Random ran = new Random(10);
        if (ran.nextInt() <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return ("Marca: "+this.marca +
                "\nModelo: "+this.modelo+
                "\nTemperatura: "+this.temperatura);
    }
}