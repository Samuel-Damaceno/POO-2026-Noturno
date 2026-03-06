public class Carro {
    public String marca, modelo, placa;
    public boolean motor; //true (ligado) ou false (desligado)
    public float velAtual;
    //Método construtor - tem o mesmo nome da classe
    public Carro(){

    }
    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = false;
        this.velAtual = 0;
    }
    //Operações (métodos)
    public String toString(){ //Converte objeto para String
        return "Marca: "+ this.marca +
                " Modelo: " + this.modelo +
                " Placa: " + this.placa +
                " Velocidade Atual: " + this.velAtual +
                "Motor: " + (this.motor ? "ligado":"Desligado"); //If else simplificado
    }

    public void alternaMotor(){
        if (this.motor) {
            this.motor = false;
            this.velAtual = 0;
            System.out.println("O carro foi desligado!");
        } else {
            this.motor = true;
            this.velAtual = 80;
            System.out.println("O carro foi ligado!");
        }
    }
    public void aceleraCarro(float vel) {
        if (this.motor) {
            if (vel >= 0) {
                this.velAtual += vel;
                System.out.println("Nova velocidade: "+this.velAtual);
            } else {
                System.out.println("Não é possível acelerar o carro por um valor negativo!");
            }
        } else {
            System.out.println("O carro não está ligado!");
        }
    }

    public void freiarCarro(float freio){
        if (this.motor && (this.velAtual - freio) >= 0 && freio >= 0) {
                this.velAtual -= freio;
                System.out.println("Nova velocidade: " + this.velAtual);
        } else {
            System.out.println("Não podemos atingir velocidades negativas.");
        }
    }
}


