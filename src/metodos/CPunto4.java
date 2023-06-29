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

    NodoABB raiz,p;

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

    public String recorridoPreOrden() {
                String resultado = null;

         
         resultado =preOrden(raiz);

        return resultado;
        
    }

    private String preOrden1(NodoABB nodo) {
        String resul = null;
        if (nodo != null) {
            resul=nodo.producto.getStock() + " ";
            System.out.println(resul);
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);

        }
        
        return resul;
    }

        public String preOrden(NodoABB p){
        String cadena="";
        if(p!= null){
            cadena= cadena+p.producto.getStock()+"  ";
            cadena= cadena+preOrden(p.izquierdo);
            cadena= cadena+preOrden(p.derecho);
        }
        return cadena;
    }   
    
        public String muestraValores(int opcion){
        p=raiz;String cadena="";
        switch(opcion){
            case 1:cadena=preOrden(p);break;
         
            default:cadena="";
        }
        
        return cadena;
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
