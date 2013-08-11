package Figuras;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 10/08/13
 * Time: 13:59
 * To change this template use File | Settings | File Templates.
 */
public class figuraTest {
    @Test
    public void testArea() throws Exception {

        circulo area1 = new circulo(14, 28);
        System.out.println("El área del Circulo es: " + area1.area());
        System.out.println();
        cuadrado area2 = new cuadrado(12);
        System.out.println("El área del Cuadrado es: " + area2.area());
        System.out.println();
        triangulo area3 = new triangulo(4, 3, 8);
        System.out.println("El área del Triangulo es: " + area3.area());
        System.out.println();
        circulo peri1 = new circulo(21, 54);
        System.out.println("El perimetro del Circulo es: " + peri1.perimetro());
        System.out.println();
        cuadrado peri2 = new cuadrado(18);
        System.out.println("El perimetro del Cuadrado es: " + peri2.perimetro());
        System.out.println();
        triangulo peri3 = new triangulo(20, 30, 20);
        System.out.println("El perimetro del Triangulo es: " + peri3.perimetro());


    }

    @Test
    public void testPerimetro() throws Exception {

    }
}
