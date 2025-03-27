public class Punto {

    private int coordenada_x;
    private int coordenada_y;

    public Punto() {}

    public Punto(int x, int y) {
        this.coordenada_x = x;
        this.coordenada_y = y;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public double calcularDistancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.coordenada_x - this.coordenada_x, 2) + 
                         Math.pow(otro.coordenada_y - this.coordenada_y, 2));
    }

    public double calcularDistancia() {
        return calcularDistancia(new Punto(0, 0));
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenada_x + ", " + coordenada_y;
    }
}