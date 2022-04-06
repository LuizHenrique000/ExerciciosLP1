public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Philips", "Amarela", 110, 60);
        System.out.println("A lampada está ligada ? " + lampada.isLigada());

        lampada.ligarLampada();
        System.out.println("A lampada está ligada ? " + lampada.isLigada());

        lampada.desligarLampada();
        System.out.println("A lampada está ligada ? " + lampada.isLigada());
    }
}
