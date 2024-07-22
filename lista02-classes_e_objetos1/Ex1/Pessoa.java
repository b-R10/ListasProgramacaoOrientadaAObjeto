public class Pessoa {
    private String nome, telefone;
    
    public void set_nome(String n) {
        this.nome = n;
    }
    
    public void set_telefone(String n) {
        this.telefone = n;
    }

    public String get_nome() {
        return nome;
    }

    public String get_telefone() {
        return telefone;
    }

    public void exibe_dados() {
        System.out.println("Nome: " + nome + ", Telefone: " + telefone);
    }
}