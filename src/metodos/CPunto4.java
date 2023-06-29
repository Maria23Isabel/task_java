package metodos;

import java.util.ArrayList;
import java.util.List;
import modelo.NodoABB;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class CPunto4 {

    NodoABB raiz;

    public void insertar(Producto producto) {
        NodoABB nuevo = new NodoABB(producto);

        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoABB actual = raiz;
            NodoABB padre;

            while (true) {
                padre = actual;

                if (producto.getStock() < actual.producto.getStock()) {
                    actual = actual.izquierdo;

                    if (actual == null) {
                        padre.izquierdo = nuevo;
                        return;
                    }
                } else {
                    actual = actual.derecho;

                    if (actual == null) {
                        padre.derecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public void recorridoPreOrden() {
        System.err.println("recorrido");
        preOrden(raiz);
    }

    private void preOrden(NodoABB nodo) {
        System.err.println(nodo);
        if (nodo != null) {
            System.out.print(nodo.producto.getStock() + " ");
            StringBuilder resultado = new StringBuilder();
resultado.append(nodo.producto.getStock()).append(" ");
String resul = resultado.toString();
            System.err.println(resul);
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);

        }
    }

    public void inOrden(NodoABB nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.producto.getStock() + " ");
            inOrden(nodo.derecho);
        }
    }

    public void recorridoInOrden() {
        System.out.print("In Orden-0: ");
        inOrden(raiz);
        System.out.println();
    }

    public void recorridoPostOrden() {
        recorridoPostOrden(raiz);
    }

    private void recorridoPostOrden(NodoABB nodo) {
        if (nodo != null) {
            recorridoPostOrden(nodo.izquierdo);
            recorridoPostOrden(nodo.derecho);
            System.out.print(nodo.producto.getStock() + " ");
        }
    }

}
