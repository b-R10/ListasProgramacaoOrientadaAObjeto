package Ex2;

public class Universidade {
    private String nome, cidade, estado;

    public void setDadosNomeUniversidade(String a) {
        this.nome = a;
    }
    public void setDadosCidade(String a) {
        this.estado = a;
    }
    public void setDadosEstado(String a) {
        this.cidade = a;
    }

    public String getDadosNome() {
        return nome;
    }
    public String getDadosCidade() {
        return cidade;
    }
    public String getDadosEstado() {
        return estado;
    }

    public void exibeDados() {
        System.out.println("Nome da Universidade: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
