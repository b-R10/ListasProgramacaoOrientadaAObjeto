package Ex2;

public class Aluno {
    private String nome, curso;

    public void setDadosNomeAluno(String a) {
        this.nome = a;
    }
    public void setDadosCurso(String a) {
        this.curso = a;
    }

    public String getDadosNome() {
        return nome;
    }
    public String getDadosCurso() {
        return curso;
    }

    public void exibeDados() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Curso do aluno: " + curso);
    }

}
