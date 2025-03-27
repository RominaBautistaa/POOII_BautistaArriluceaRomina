public class Triangulo extends FiguraGeometrica {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(String nombre, Punto p1, Punto p2, Punto p3) {
        super(nombre);
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public double calcularAreaFigura() {
        double a = punto1.getDistancia(punto2);
        double b = punto2.getDistancia(punto3);
        double c = punto3.getDistancia(punto1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public boolean esRegular() {
        double a = punto1.getDistancia(punto2);
        double b = punto2.getDistancia(punto3);
        double c = punto3.getDistancia(punto1);
        return a == b && b == c;
    }
}