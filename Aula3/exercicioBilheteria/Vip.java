package exercicioBilheteria;

public class Vip extends Ingresso {
    private double valorAdicional = 10;
    private double valorAjustado;

    public Vip() {
    }

    public Vip(double valor) {
        super(valor);
    }

    @Override
    public double getValor() {
        valorAjustado = super.getValor() + valorAdicional;
        return valorAjustado + super.getValor();
    }

    @Override
    public String toString() {
        return "Vip [valor=" + valorAjustado + "]";
    }
}
