package exercicioBilheteria;

public class CamaroteSuperior extends Vip {

    @Override
    public double getValor() {
        double valorAdicional = super.getValor() * 0.90;
        return super.getValor() + valorAdicional;
    }

    @Override
    public String toString() {
        return "CamaroteSuperior []";
    }
}