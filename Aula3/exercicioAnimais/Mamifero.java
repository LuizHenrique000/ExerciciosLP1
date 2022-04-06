package exercicioAnimais;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero(String nome, double comprimento, int numDePatas, String cor, String ambiente,
            double velocidadeMedia, String alimento) {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        retorno += "Mamifero [alimento=" + alimento + "]";
        return retorno;
    }

}
