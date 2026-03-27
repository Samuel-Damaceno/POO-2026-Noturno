import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime data;
    private double valor;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, double valor, Medico medico, Paciente paciente) {
        setData(data);
        setValor(valor);
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        if (data.isAfter(LocalDateTime.now())) {
            this.data = data;
        } else {
            System.out.println("Data inválida!");
            this.data = LocalDateTime.now();
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            this.valor = 0;
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", valor=" + valor +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
