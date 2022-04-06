package exercicioBilheteria;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior() {
    }

    public CamaroteInferior(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "CamaroteInferior [localizacao=" + localizacao + "]";
    }
}
