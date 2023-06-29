package modelo;

/**
 * 
 * @author maria
 */
public class NodoABB {
    
    public Producto producto;
    public NodoABB izquierdo;
    public NodoABB derecho;
        
    public NodoABB(Producto producto) {
        this.producto = producto;
        this.izquierdo = null;
        this.derecho = null;
    }
}
