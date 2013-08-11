package co.edu.um.Leg;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 11/08/13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class TestListaInteger {
    public static void main(String[] args) {
        Leg<Integer> l = new Leg<Integer>();
        l.insertar(new Integer(9));
        l.insertar(new Integer(12));
        System.out.println("Lista Integer actual:\n"+l.toString());
        System.out.println("Borrando de la lista el 10");
        if(!l.eliminar(new Integer(10)))
        System.out.println("Elemento existente");

    }

}
