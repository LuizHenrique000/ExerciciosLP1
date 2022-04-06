public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1234, "Luiz", 10.0, 10.0, 9.0);
        System.out.println("Aluno : " + aluno.getNome() + "\nNota1: " + aluno.getProva1() + "\nNota2: "
                + aluno.getProva2()
                + "\nNota do trabalho: " + aluno.getTrabalho() + "\nSituação: " + aluno.aprovarAluno() + "\nMedia: "
                + aluno.calcularMedia());

    }
}
