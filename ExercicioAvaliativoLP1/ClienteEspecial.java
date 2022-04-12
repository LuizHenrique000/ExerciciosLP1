public class ClienteEspecial extends ContaBancaria{

    public ClienteEspecial(double saldo) {
        super(saldo);
    }

    @Override
    public void Sacar(){
        double taxa = (saldo / 100) * 0.1;
        double total = saldo + taxa;
        System.out.println("Seu saldo: " + saldo + "\nTaxa de operação especial: " + taxa + "\nTotal: " + total );
    }

    @Override
    public String toString() {
        return "ClienteEspecial [saldo="+ saldo + "]";
    }

    
}
