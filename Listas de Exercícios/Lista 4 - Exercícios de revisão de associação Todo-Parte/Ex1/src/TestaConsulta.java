import java.time.LocalDateTime;

public class TestaConsulta {
    static void main() {
        Medico m1 = new Medico(1, "Dr. Juan", "Odontologia");
        Paciente p1 = new Paciente(1, "Carlinhos", "123.456.789-10");
        Consulta c1 = new Consulta(LocalDateTime.of(2026, 5, 20, 10, 10), 100, m1, p1);

        System.out.println(c1.toString());
    }
}
