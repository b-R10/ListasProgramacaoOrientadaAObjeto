package Ex1;

public class TestePontos2D {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(5.0, 10.0);

        System.out.println("Dados do ponto 1:");
        ponto1.exibeDados();
        
        System.out.println("Dados do ponto 2:");
        ponto2.exibeDados();

        System.out.println("Número de instâncias: " + Ponto2D.getContador());
    }
}
