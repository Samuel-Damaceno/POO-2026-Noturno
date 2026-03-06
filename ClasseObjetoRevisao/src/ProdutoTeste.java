public class ProdutoTeste {
    public static void main(String[] args){
        Produto celular = new Produto("Celular", 1200, 5);

        celular.vender(3);
        celular.vender(30);
        celular.repor(10);
        celular.exibirInformacoes();
    }
}
