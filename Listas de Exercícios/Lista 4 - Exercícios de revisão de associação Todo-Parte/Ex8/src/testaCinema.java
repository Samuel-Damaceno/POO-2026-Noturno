import java.time.LocalDateTime;

public class testaCinema {
    static void main() {
        Filme filme1 = new Filme(1, 130, "De medo", "O medo");
        Filme filme2 = new Filme(2, 100, "Ação", "Batman");
        Sessao s1 = new Sessao(1, 1, filme2, LocalDateTime.of(2026, 4, 12, 18, 30));

        s1.venderIngresso(1, "04", Ingresso.TipoIngresso.INTEIRA, 30);
        s1.venderIngresso(2, "05", Ingresso.TipoIngresso.MEIA, 15);
        s1.venderIngresso(3, "45", Ingresso.TipoIngresso.INTEIRA, 30);

        System.out.println(s1.toString());
    }
}
