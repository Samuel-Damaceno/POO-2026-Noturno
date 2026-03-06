public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(){
    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    private boolean verifica(double valor){
        if (valor > 0) {
            return true;
        } else {
            System.out.println("Valor não pode ser 0 ou negativo!");
            return false;
        }
    }

    public void depositar (double valor) {
        if (verifica(valor)) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado!");
            System.out.println("O saldo total agora é R$" + saldo);
        }
    }

    public void sacar (double valor) {
        if (verifica(valor)) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado!");
                System.out.println("O saldo total agora é R$" + saldo);
            } else {
                System.out.println("Saldo insuficiente para a operação!");
            }
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$"+this.saldo);
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (verifica(valor)) {
            if (this.saldo >= valor) {
                this.sacar(valor);
                destino.depositar(valor);
            } else {
                System.out.println("Saldo insuficiente para a operação!");
            }
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return this.titular;
    }
}