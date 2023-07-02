package metodos;

import java.util.Hashtable;
import java.util.Map;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class TPunto3 {

    private Hashtable<String, Producto> productos;

    public TPunto3() {
        productos = new Hashtable<>();
    }

    public int agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
        return 200;
    }

    public Producto buscarProducto(String codigo) {
        return productos.get(codigo);
    }

    public String mostrarProductos() {
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            String clave = entry.getKey();
            Producto producto = entry.getValue();

            resultado.append("Clave: ").append(clave);
            resultado.append(" -- Código: ").append(producto.getCodigo());
            resultado.append(" -- Nombre: ").append(producto.getNombre());
            resultado.append(" -- Stock: ").append(producto.getStock());
            resultado.append(" -- Precio: ").append(producto.getPrecio());
            resultado.append(" -- Descripción: ").append(producto.getDescripcion());
            resultado.append(" -- Proveedor: ").append(producto.getProvedor());
            resultado.append("\n");
        }
        return resultado.toString();
    }

}
