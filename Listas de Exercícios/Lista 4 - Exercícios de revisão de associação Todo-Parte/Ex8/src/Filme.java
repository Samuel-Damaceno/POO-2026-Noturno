public class Filme {
    private int id, duracaoMinutos;
    private String genero, titulo;

    public Filme() {
    }

    public Filme(int id, int duracaoMinutos, String genero, String titulo) {
        this.id = id;
        setDuracaoMinutos(duracaoMinutos);
        this.genero = genero;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos >= 1) {
            this.duracaoMinutos = duracaoMinutos;
        } else {
            this.duracaoMinutos = 0;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", duracaoMinutos=" + duracaoMinutos +
                ", genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
