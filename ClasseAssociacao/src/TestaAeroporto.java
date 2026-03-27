import java.time.LocalDateTime;

public class TestaAeroporto {
    static void main() {
        Passageiro p1 = new Passageiro("12312312-12", "Eu mesmo aqui ó!");
        LocalDateTime data = LocalDateTime.of(2026, 7, 15, 13, 10);
        Voo v1 = new Voo(12, "O fundo do poço", "Abismo", data);
        Reserva r1 = new Reserva(1, 23, LocalDateTime.now(), p1, v1);

        System.out.println(r1.toString());
    }
}
