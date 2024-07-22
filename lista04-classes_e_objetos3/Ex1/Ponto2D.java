package Ex1;
public class Ponto2D {
    private double x, y;
    private static int contador = 0;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    static int getContador() {
        return contador;
    }

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
        contador++;
    }
    
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
        contador++;
    }

    public void exibeDados() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }
    
}