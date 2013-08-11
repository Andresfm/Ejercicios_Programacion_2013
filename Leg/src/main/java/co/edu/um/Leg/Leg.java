package co.edu.um.Leg;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 11/08/13
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */
public class Leg<E> {
    protected NodoLeg<E> primero; protected int talla;

    public Leg(){
        primero = null;
        talla =0;
    }
     public void talla(){

    }
    public void insertar(E x){
        NodoLeg<E> nuevo = new NodoLeg<E>(x);
        nuevo.siguiente = primero;
        primero=nuevo;
        this.talla++;
    }
    public void insertarEnFin(E x){
        NodoLeg<E> nl=new NodoLeg<E>(x);
        this.talla++;
        NodoLeg<E> aux = primero;
        if(aux == null)primero=nl;
        else {
            while (aux.siguiente !=null) aux=aux.siguiente;
            aux.siguiente=nl;//aux.siguiente es el ultimo nodo de la lista
        }

    }
    public boolean eliminar(E x){
        NodoLeg<E> aux = primero,ant = null;
        boolean res = false;
        while (aux != null && !aux.dato.equals(x)){
            ant = aux; aux= aux.siguiente;
        }
        if (aux != null){
            res = true;
            this.talla--;
            if (ant == null)primero=aux.siguiente;
            else ant.siguiente = aux.siguiente;
        }
        return res;
    }

    public String toString(){
        String res="";
        for (NodoLeg<E> aux=primero;aux !=null;aux=aux.siguiente )
            res += aux.dato.toString()+"\n";
        return res;

    }

}
