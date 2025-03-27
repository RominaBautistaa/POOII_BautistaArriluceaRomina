public class Punto {

    public int coordenada_x;
    public int coordenada_y;

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

    public double getDistancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.coordenada_x - this.coordenada_x, 2) + Math.pow(otro.coordenada_y - this.coordenada_y, 2));
    }

    @Override
    public String toString() {
        return "Punto[coordenada_x=" + coordenada_x + ", coordenada_y=" + coordenada_y + "]";
    }
}