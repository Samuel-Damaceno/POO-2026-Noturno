import java.util.ArrayList;

public class Venda {
    private int idVenda;
    private Cliente cliente;
    private ArrayList<ItemVenda> lista = new ArrayList<ItemVenda>();

    public Venda() {
    }

    public Venda(int idVenda, Cliente cliente) {
        this.idVenda = idVenda;
        this.cliente = cliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ItemVenda> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "idVenda=" + idVenda +
                ", cliente=" + cliente +
                ", lista=" + lista +
                '}';
    }

    public void adicionaItem(int id, int quantidade, Produto item) {
        this.lista.add(new ItemVenda(id, quantidade, item));
    }

    public void listaProdutos() {
        System.out.println("==---==");
        for (int i=0; i<this.lista.size(); i++) {
            System.out.println("["+i+"] "+this.lista.get(i));
        }
        System.out.println("==---==");
    }
}
