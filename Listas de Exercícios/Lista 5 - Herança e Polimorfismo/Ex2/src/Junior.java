public class Junior extends Desenvolvedor{
    private String mentor;

    public Junior() {
    }

    public Junior(String nome, String linguagem, float salario, String mentor) {
        super(nome, linguagem, salario);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }

    @Override
    public void codar() {
        System.out.println("Desenvolvedor nível Junior "+this.nome+" aprendendo a codar com a supervisão de Pleno "+this.mentor+"...");
    }
}
