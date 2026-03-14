import java.util.Random;

public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.codigo = codigo;
        setAltura(altura);
        setBateria(bateria);
        this.emVoo = emVoo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura >= 0 && altura <= 120) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida");
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria >=0 && bateria <= 100) {
            this.bateria = bateria;
        }
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar() {
        if (this.bateria > 20 && testarMotores()) {
            this.emVoo = true;
            System.out.println("Motores ligados, iniciando decolagem");
        } else {
            System.out.println("Requesitos não preenchidos, impossível decolar.");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        Random rand = new Random(10);
        if (rand.nextInt() < 8) {
            System.out.println("Tudo pronto para decolar!");
            return true;
        } else {
            System.out.println("Não estamos prontos para decolar!");
            return false;
        }
    }

    public void subirVoo(float x) {
        if (this.altura + x <= 120 && this.altura + x >= 0) {
            this.altura += x;
        } else {
            System.out.println("Altura depois da alteração é inválida");
        }
    }

    public void descerVoo(float x) {
        if (this.altura - x <= 120 && this.altura - x >= 0) {
            this.altura -= x;
        } else {
            System.out.println("Altura depois da alteração é inválida");
        }
    }

    @Override
    public String toString() {
        return ("codigo=" + codigo +
                "\naltura=" + altura +
                "\nbateria=" + bateria +
                "\nemVoo=" + emVoo);
    }
}
