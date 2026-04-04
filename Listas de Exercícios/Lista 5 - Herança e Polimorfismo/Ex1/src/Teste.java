//Classe de testes de 'Veiculo', 'Aviao' e 'CarroEletrico'
public class Teste {
    public static void main(String[] args) {

        Aviao aviao = new Aviao("Boeing", "747", 850, 12000, 8000);
        CarroEletrico carro = new CarroEletrico("Tesla", "Model S", 120, 500);

        System.out.println("\n=== Teste Avião ===");
        aviao.mover();
        aviao.abastecer();

        System.out.println("\n=== Teste Carro Elétrico ===");
        carro.mover();
        carro.abastecer();

        System.out.println("\n=== Transformando em Aviao ===");
        Veiculo v;

        v = new Aviao("Aquela famosinha", "O mais recente", 0,2000, 0);
        v.mover();

        System.out.println("\n=== Transformando em CarroEletrico ===");
        v = new CarroEletrico("Aquela famosinha", "O mais recente", 0,2000);
        v.mover();
    }
}