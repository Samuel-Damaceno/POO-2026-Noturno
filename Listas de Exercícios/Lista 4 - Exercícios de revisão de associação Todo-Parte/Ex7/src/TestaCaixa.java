public class TestaCaixa {
    static void main() {
        Produto p1 = new Produto(1, "Cartolina", 1.00);
        Produto p2 = new Produto(2, "Patolina", 100.50);
        Produto p3 = new Produto(3, "Cartola", 55.99);

        Cliente c1 = new Cliente(1, "O mago");

        Venda v1 = new Venda(1, c1);

        v1.adicionaItem(1, 3, p1);
        v1.adicionaItem(2, 100, p3);
        v1.adicionaItem(3, 1, p2);

        v1.listaProdutos();
    }
}
