public class Pleno extends Desenvolvedor{
    private int projEntregue;

    public Pleno(String nome, String linguagem, float salarioBase) {
        super();
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projEntregue) {
        super(nome, linguagem, salarioBase);
        this.projEntregue = projEntregue;
    }

    public int getProjEntregue() {
        return projEntregue;
    }

    public void setProjEntregue(int projEntregue) {
        this.projEntregue = projEntregue;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntregue=" + projEntregue +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Pleno codando e fazendo CodenReview");
    }

    @Override
    public float calculaBonus() {
        return this.salarioBase*0.15f;
    }
}
