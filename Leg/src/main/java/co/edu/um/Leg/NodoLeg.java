package co.edu.um.Leg;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 11/08/13
 * Time: 16:43
 * To change this template use File | Settings | File Templates.
 */
public class NodoLeg <E> {
    E dato;
    NodoLeg<E>siguiente;

    NodoLeg(E dato){
        this(dato,null);
    }
    NodoLeg(E dato,NodoLeg<E>siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }


    /*
    NodoLeg<E> nuevo = new NodoLeg<E>(x);
    nuevo.siguiente = primero;
    primero=nuevo;
  */
}
