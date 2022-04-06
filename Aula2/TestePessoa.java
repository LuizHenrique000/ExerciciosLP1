import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {
        LocalDate dataDeNascimento = LocalDate.of(2004, 11, 30);
        Pessoa pessoa = new Pessoa("Luiz", dataDeNascimento, 1.75);
        System.out.println("idade: " + pessoa.calcularIdade());
    }
}
