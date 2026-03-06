public class Conta {
    public int numeroConta, agencia;
    public float saldo;
    public String nomeCliente;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor) {
        if (valor >= 0 && this.status) {
            this.saldo += valor;
            System.out.println("Deposito efetuado!");
        } else {
            System.out.println("Deposito negado!");
        }
    }

    public void sacar(float valor) {
        if (this.status && this.saldo >= valor) {
            System.out.println("Saque efetuado!");
            this.saldo -= valor;
        } else {
            System.out.println("Saque negado!");
        }
    }

    public void encerrarConta() {
        if (this.status && this.saldo == 0) {
            System.out.println("Conta foi encerrada!");
            this.status = false;
        } else {
            System.out.println("Conta não pode ser encerrada!");
        }
    }

    public String toString() {
        return ("N° da Conta: "+this.numeroConta+
                "\nN° da Agência: "+this.agencia+
                "\nNome do Cliente: "+this.nomeCliente+
                "\nSaldo: R$"+this.saldo+
                "\nStatus: "+(this.status ? "Ativada":"Desativada"));
    }
}
