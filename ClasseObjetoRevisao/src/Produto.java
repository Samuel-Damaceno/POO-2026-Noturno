public class Produto {
    String nome;
    double preco;
    int qtdEstoque;

    //Construtores
    public Produto(){
    }

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        if(preco < 0) {
            preco = 0;
        }
        this.preco = preco;
        if(qtdEstoque < 0) {
            qtdEstoque = 0;
        }
        this.qtdEstoque = qtdEstoque;
    }

    //Métodos
    public void vender(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= qtdEstoque) {
                this.qtdEstoque -= quantidade;
                System.out.println("Valor da venda: R$"+this.preco * quantidade);
                System.out.println("Venda bem sucedida!");
            } else {
                System.out.println("Quantidade de estoque insuficiente!");
            }
        } else {
            System.out.println("Quantidade menor ou igual a 0!");
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            this.qtdEstoque += quantidade;
            System.out.println("Estoque abastecido com "+quantidade+" Unidades!");
        } else {
            System.out.println("Impossível repor quantidade especificada!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("======");
        System.out.println("Produto: "+this.nome);
        System.out.println("Preço: R$"+this.preco);
        System.out.println("Quantidade em estoque: "+this.qtdEstoque);
        System.out.println("Valor total em estoque: R$"+(this.qtdEstoque * this.preco));
    }
}
