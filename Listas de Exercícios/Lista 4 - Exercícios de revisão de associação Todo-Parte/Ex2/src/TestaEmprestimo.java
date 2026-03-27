public class TestaEmprestimo {
    static void main() {
        Livro livro1 = new Livro(1, "Dom Quixote", "Miguel de Cervantes");
        Leitor leitor1 = new Leitor(1, "Samuel :D");
        Emprestimo em1 = new Emprestimo(livro1, leitor1);

        System.out.println(em1.toString());
    }
}
