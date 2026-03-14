public class TestaArCondicionado {
    static void main() {
        ArCondicionado ac1 = new ArCondicionado(20, "Tanasonic", "Ber19");
        System.out.println(ac1.toString());
        System.out.println("===============");
        ArCondicionado ac2 = new ArCondicionado(100, "", "Essa ai");
        System.out.println("===============");
        System.out.println(ac2.toString());
        System.out.println("===============");
    }
}
