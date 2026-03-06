public class TestaCarro {
    public static void main(String args[]){
        //Cria um objeto (instância da classe Carro)
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.placa = "E2D31F0";
        obj1.motor = false;
        obj1.velAtual = 0;
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("Volks", "Pollo", "E9473F2");
        System.out.println(obj2.toString());

        obj2.alternaMotor();
        System.out.println(obj2.toString());
    }
}
