package exemplo1;
public class Usuario {
    private String nome;
    private int matricula;
    private Dispositivo dispositivo;

    public Usuario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void set_dispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String get_nome_usuario() {
        return nome;
    }
    public int get_matricula() {
        return matricula;
    }


    public void trabalhar(String nome_usuario) {
        dispositivo.usar(nome_usuario);
    }
}
