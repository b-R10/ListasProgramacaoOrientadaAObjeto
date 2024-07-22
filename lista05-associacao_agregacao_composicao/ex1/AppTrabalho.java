package exemplo1;
public class AppTrabalho {
    public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo(1, "notebook");
        Dispositivo dispositivo2 = new Dispositivo(2, "Desktop");

        Usuario usuario1 = new Usuario(1, "Theodoro");
        Usuario usuario2 = new Usuario(2, "Ana");

        usuario1.set_dispositivo(dispositivo1);
        usuario1.trabalhar(usuario1.get_nome_usuario());
        usuario2.set_dispositivo(dispositivo2);
        usuario2.trabalhar(usuario2.get_nome_usuario());
    }
}
