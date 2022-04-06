
public class Aluno {
    private int matricula;
    private String nome;
    private double prova1;
    private double prova2;
    private double trabalho;
    private boolean aprovado;

    public Aluno() {
    }

    public Aluno(int matricula, String nome, double prova1, double prova2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public double calcularMedia() {
        double media = (prova1 + prova2 + trabalho) / 3;
        return media;
    }

    public boolean aprovarAluno() {
        if (calcularMedia() >= 7) {
            return aprovado = true;
        } else {
            return aprovado = false;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    @Override
    public String toString() {
        return "Aluno [aprovado=" + aprovado + ", matricula=" + matricula + ", nome=" + nome + ", prova1=" + prova1
                + ", prova2=" + prova2 + ", trabalho=" + trabalho + "]";
    }

}
