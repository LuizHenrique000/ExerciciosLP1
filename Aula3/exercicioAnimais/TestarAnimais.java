package exercicioAnimais;

public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150.0, 4, "Amarelo", "Terra", 2.0, "Leite");
        Peixe tubarao = new Peixe("Tilapia", 20.0, 0, "Cinzento", "Mar", 1.5, "Cauda");
        Mamifero ursoCanada = new Mamifero("Urso-do-Canadá", 180.0, 4, "Vermelho", "Terra", 0.5, "Mel");
        camelo.toString();
        System.out.println(camelo);
        tubarao.toString();
        System.out.println(tubarao);
        ursoCanada.toString();
        System.out.println(ursoCanada);
    }
}
