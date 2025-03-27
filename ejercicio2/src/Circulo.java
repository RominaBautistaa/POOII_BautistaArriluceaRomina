public class Circulo {

    private double radio = 12.5;
    private String color = "azul";

    public Circulo() {} // constructor sin argumentos

    public Circulo(double radio) { // constructor con argumento
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}