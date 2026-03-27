import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataEmprestimo, devolucaoPrevista;
    private Livro livro;
    private Leitor leitor;

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, Leitor leitor) {
        this.dataEmprestimo = LocalDateTime.now();
        this.devolucaoPrevista = this.dataEmprestimo.plusDays(7);;
        this.livro = livro;
        this.leitor = leitor;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDevolucaoPrevista() {
        return devolucaoPrevista;
    }

    public void setDevolucaoPrevista(LocalDateTime devolucaoPrevista) {
        this.devolucaoPrevista = devolucaoPrevista;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        return "\n===\nLeitor: " + this.leitor +
                "\n===\nLivro:" + this.livro.getTitulo()+
                "\n===\n";
    }
}
