public class ContaBancaria {
    protected double saldo;


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public void Sacar(){
        double taxa = (saldo / 100) * 0.5;
        double total = saldo + taxa;
        System.out.println("Seu saldo: " + saldo + "\nTaxa de operação normal: " + taxa + "\nTotal: " + total );
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [saldo=" + saldo + "]";
    }
}