public class ContaBancariaTeste {
    public static void main (String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Samuel", 0);
        ContaBancaria conta2 = new ContaBancaria("Tana", 100);
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.exibirSaldo();
        conta1.sacar(400);

        conta2.transferir(conta1, 100);
        conta2.exibirSaldo();
        conta1.exibirSaldo();
    }
}
