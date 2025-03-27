public class Triangulo extends FiguraGeometrica {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        super("Triangulo");
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(String nombre, Punto p1, Punto p2, Punto p3) {
        super(nombre);
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
}