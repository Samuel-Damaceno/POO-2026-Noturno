public class Aluno {
    private String nome;
    private double nota1, nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        if (nota1 <10 && nota1>=0) {
            this.nota1 = nota1;
        } else {
            this.nota1 = 0;
        }

        if (nota2 <= 10 && nota2 >= 0) {
            this.nota2 = nota2;
        } else {
            this.nota2 = 0;
        }
    }

    public double calcularMedia(double nota1, double nota2) {
        return ((nota1 + nota2)/2);
    }

    public String verificarAprovacao(double media) {
        if (media >= 6) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    public void exibirInformacoes() {
        System.out.println("Aluno: "+this.nome);
        System.out.println("Nota 1: "+this.nota1);
        System.out.println("Nota 2: "+this.nota2);
        double media = this.calcularMedia(this.nota1, this.nota2);
        System.out.println("Média: "+media);
        System.out.println("Situação: "+this.verificarAprovacao(media));
    }
}
