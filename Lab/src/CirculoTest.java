public class CirculoTest {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(); // constructor sin argumentos
        Circulo c2 = new Circulo(6.55); // constructor con radio

        System.out.println("Usando constructor por defecto:");
        System.out.println("Radio de c1: " + c1.getRadio());
        System.out.println("Area de c1: " + c1.getArea());

        System.out.println("Usando constructor sobrecargado: ");
        System.out.println("Radio de c2: " + c2.getRadio());
        System.out.println("Area de c2: " + c2.getArea());

    }
}