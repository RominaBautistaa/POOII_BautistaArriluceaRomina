public class CirculoTest {

    public static void main(String[] args) {

        // objeto tipo circulo
        Circulo cl = new Circulo();

        // Modificar sus valores
        cl.setRadio(10.0);
        cl.setColor("rojo");

        // Mostrar los valores actualizados
        System.out.println("Radio modificado: " + cl.getRadio());
        System.out.println("Color modificado: " + cl.getColor());
    }
}