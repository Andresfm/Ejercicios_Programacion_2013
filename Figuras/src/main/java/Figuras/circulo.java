package Figuras;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 10/08/13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class circulo extends figura {

    private final double PI = 3.1416;
    private double radio, diametro;

    public circulo (double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double area() {
        return PI*(radio*radio);
    }

    @Override
    public double perimetro() {
        return diametro*PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
