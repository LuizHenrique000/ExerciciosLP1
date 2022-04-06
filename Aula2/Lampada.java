public class Lampada {

    private String modelo;
    private String cor;
    private int voltagem;
    private int potencia;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String modelo, String cor, int voltagem, int potencia) {
        this.modelo = modelo;
        this.cor = cor;
        this.voltagem = voltagem;
        this.potencia = potencia;
    }

    public void ligarLampada() {
        setLigada(true);
    }

    public void desligarLampada() {
        setLigada(false);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    @Override
    public String toString() {
        return "Lampada [cor=" + cor + ", ligada=" + ligada + ", modelo=" + modelo + ", potencia=" + potencia
                + ", voltagem=" + voltagem + "]";
    }

}
