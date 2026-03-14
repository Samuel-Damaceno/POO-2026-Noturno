import java.util.Objects;

public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTv(){

    }

    public SmartTv(String marca, String modelo, int volume, boolean internet){
        setMarca(marca);
        setModelo(modelo);
        setVolume(volume);
        this.internet = internet;
    }

    //Setters
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Volume inválido!");
        }
    }

    public void setMarca(String marca){
        if (marca.length() <= 30) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida!");
        }
    }

    public void setModelo(String modelo) {
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);
        if (resp) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido!");
        }
    }

    //Getters
    public int getVolume() {
        return this.volume;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    //Outros métodos
    public void aumenteVolume(int x) {
        this.setVolume(this.volume + x);
    }

    public void abaixaVolume(int x) {
        this.setVolume(this.volume - x);
    }

    //Private
    private boolean conectaInternet() {
        System.out.println("Verificando conexões disponíveis...");
        System.out.println("Consultando as credenciais...");

        int rand = (int)(Math.random()*10);
        if (rand < 5) {
            System.out.println("IP gerado com sucesso");
            return true;
        } else {
            System.out.println("Falha na conexão");
            return false;
        }
    }
}