public class TestaTimeBasquete {
    static void main() {
        Atleta a1 = new Atleta(1, "Priscilla", "Não sei posição de basquete");
        Atleta a2 = new Atleta(2, "Carlas Drumond", "Não sei posição de basquete");
        Atleta a3 = new Atleta(3, "Virgulina", "Não sei posição de basquete");
        Time t1 = new Time(1, "As queridas", "Faustão");
        t1.contratarAtleta(a1);
        t1.contratarAtleta(a2);
        t1.contratarAtleta(a3);

        System.out.println(t1.toString());

        t1.demitirAtleta(a2);
        t1.demitirAtleta(a3);

        t1 = null;

        System.out.println("Atletas: \n"+a1.toString()+";\n"+a2.toString()+";\n"+a3.toString()+".");
    }
}
