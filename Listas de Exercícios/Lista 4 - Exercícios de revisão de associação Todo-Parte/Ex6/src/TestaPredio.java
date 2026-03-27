public class TestaPredio {
    static void main() {
        Edificio p1 = new Edificio("O prédio azul", "Avenida dos detetives");
        p1.construirApartamento(404, 4);
        p1.construirApartamento(101, 1);
        p1.construirApartamento(201, 2);
        p1.construirApartamento(303, 3);

        System.out.println(p1.toString());
    }


}
