public class Pleno extends Desenvolvedor{
    private int projetosEntregues;

    public Pleno() {
    }

    public Pleno(String nome, String linguagem, float salario, int projetosEntregues) {
        super(nome, linguagem, salario);
        this.projetosEntregues = projetosEntregues;
    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projetosEntregues=" + projetosEntregues +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Desenvolvedor Pleno " + this.nome + " trabalhando o código de seu "+this.projetosEntregues + "° projeto...");
    }

    @Override
    public float calcularBonus() {
        System.out.println("Calculando bônus para o Junior " + this.nome + " considerando um aumento de 3% por cada um de seus " + this.projetosEntregues + " projetos entreges nesse mês...");
        return (this.salario + (this.salario*(this.projetosEntregues*0.03f)));
    }
}
