package exercicioBilheteria;

public class TesteBilheteria {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(10);
        Vip vip = new Vip(10);
        ingresso.toString();
        System.out.println(ingresso);
        vip.toString();
        vip.getValor();
        System.out.println(vip);
    }
}
