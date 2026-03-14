public class TestaDrone {
    public static void main(String[] args) {
        Drone dr1 = new Drone("T4N4", 0, 100, false);
        Drone dr2 = new Drone("T4T5", -12, 15, true);
        System.out.println("===============");
        System.out.println(dr1.toString());
        System.out.println("===============");
        System.out.println(dr2.toString());
    }
}
