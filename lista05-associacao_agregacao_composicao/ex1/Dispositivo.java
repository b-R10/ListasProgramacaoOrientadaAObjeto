package exemplo1;
public class Dispositivo {
    private int codigo;
    private String nome;

    public Dispositivo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void usar(String nome_usuario) {
        System.out.println(nome_usuario + " está usando o dispositivo " + nome + ", código: " + codigo);
    }
}