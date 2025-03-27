public class Circulo {

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + "]";
    }

    private double radio;
    private String color;
}