import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime horario;
    private ArrayList<Ingresso> lista = new ArrayList<Ingresso>();
    private Filme filme;

    public Sessao() {
    }

    public Sessao(int id, int sala, Filme filme,LocalDateTime horario) {
        this.id = id;
        this.sala = sala;
        this.horario = horario;
        this.filme = filme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public ArrayList<Ingresso> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ingresso> lista) {
        this.lista = lista;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Sessao{" +
                "id=" + id +
                ", sala=" + sala +
                ", horario=" + horario.format(formato) +
                ", lista=" + lista +
                ", filme=" + filme +
                '}';
    }

    public void venderIngresso(int id, String assento, Ingresso.TipoIngresso tipo, float preco){
        Ingresso i = new Ingresso(id, preco, tipo, assento);
        this.lista.add(i);
    }
}
