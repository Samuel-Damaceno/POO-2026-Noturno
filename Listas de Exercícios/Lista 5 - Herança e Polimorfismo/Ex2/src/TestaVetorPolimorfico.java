public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] folhaPagamento = new Desenvolvedor[4];

        folhaPagamento[0] = new Junior("Ana", "Python",2000, "Bruno");
        folhaPagamento[1] = new Pleno("Bruno", "Python", 4000, 3);
        folhaPagamento[2] = new Senior("Carlos", "C++", 6000, 1200f);
        folhaPagamento[3] = new Desenvolvedor("Daniel", "Java", 3000);

        for (Desenvolvedor d : folhaPagamento) {
            d.codar();
            System.out.println("Bônus: R$" + d.calcularBonus());
            System.out.println(d.toString());
            System.out.println("=======================");
        }
    }
}
