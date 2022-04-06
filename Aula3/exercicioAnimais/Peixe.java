package exercicioAnimais;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Peixe(String nome, double comprimento, int numDePatas, String cor, String ambiente, double velocidadeMedia,
            String caracteristica) {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        retorno += "Peixe [caracteristica=" + caracteristica + "]";
        return retorno;
    }

}
