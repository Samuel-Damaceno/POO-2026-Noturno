public class TestaProjeto {
    static void main() {
        Programador p1 = new Programador(1, "Rick", "Java");
        Programador p2 = new Programador(2, "Igor", "Java");
        Programador p3 = new Programador(3, "Maria", "Java");
        Programador p4 = new Programador(4, "Jeniffer", "JS");
        Programador p5 = new Programador(5, "Fernanda", "Java");
        Programador p6 = new Programador(6, "Samuel", "Python");

        Projeto PI = new Projeto(1, "PI");

        PI.adicionaProgramador(p1);
        PI.adicionaProgramador(p2);
        PI.adicionaProgramador(p3);
        PI.adicionaProgramador(p4);
        PI.adicionaProgramador(p5);
        PI.adicionaProgramador(p6);

        PI.listaProgramador();
    }
}
