import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> membros = new ArrayList<Programador>();

    public Projeto() {
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void adicionaProgramador(Programador programador){
        this.membros.add(programador);
    }

    public void retiraProgramador(Programador programador){
        if (!membros.contains(programador)) {
            this.membros.remove(programador);
        } else {
            System.out.println("O programador '"+programador.getId() + "' de nome '"+programador.getNome()+"' não está na lista de membros do projeto.");
        }
    }

    public void listaProgramador(){
        for (int i = 0; this.membros.size() > i; i++) {
            System.out.println((this.membros.get(i)));
        }
    }

    public ArrayList<Programador> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Programador> membros) {
        this.membros = membros;
    }
}
