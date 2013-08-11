package Figuras;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 10/08/13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class cuadrado extends figura{

    private double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
