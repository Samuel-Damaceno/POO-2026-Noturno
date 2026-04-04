public class Senior extends Desenvolvedor {
    private float verbaLider;

    public Senior() {
    }

    public Senior(String nome, String linguagem, float salario, float verbaLider) {
        super(nome, linguagem, salario);
        this.verbaLider = verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Desenvolvedor Senior " + this.nome + "manipulando códigos...");
    }

    @Override
    public float calcularBonus(){
        System.out.println("Calculando bônus para o Sênior " + this.nome + " considerando um aumento de R$" + this.verbaLider + "já que é o lider do projeto...");
        return (this.salario + this.verbaLider);
    }
}
