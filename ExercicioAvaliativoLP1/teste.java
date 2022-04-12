public class teste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(100);
        ClienteEspecial clienteEspecial = new ClienteEspecial(50);
        contaBancaria.getSaldo();
        clienteEspecial.getSaldo();
        contaBancaria.Sacar();
        clienteEspecial.Sacar();
        contaBancaria.toString();
        clienteEspecial.toString();
        System.out.println(contaBancaria);
        System.out.println(clienteEspecial);
    }
}
