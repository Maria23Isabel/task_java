
package clases;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Metodo_busqueda {

    public Metodo_busqueda() {
    }

    //<editor-fold defaultstate="collapsed" desc="Busqueda por valor numerico">

    public ArrayList<String[]> buscarProductoPorStock2(int stock, Object[][] productos) {
    ArrayList<String[]> productoEncontrado = new ArrayList<>();
    for (int i = 0; i < productos.length; i++) {
        int cantidad = (int) productos[i][2];
        if (cantidad == stock) {
            String codigoActual = (String) productos[i][0];
            String nombre = (String) productos[i][1];
            int cantidad2 = (int) productos[i][2];
            double precio = (double) productos[i][3];
            String descripcion = (String) productos[i][4];
            String proveedor = (String) productos[i][5];

            String[] fila = {codigoActual, nombre, Integer.toString(cantidad), Double.toString(precio),
                    descripcion, proveedor};
            productoEncontrado.add(fila);
        }
    }
    if (productoEncontrado.isEmpty()) {
        System.out.println("Producto no encontrado: ");
        return productoEncontrado;
    }   return productoEncontrado;
}
      
    public ArrayList<String[]> buscarProductoPorPrecio2(double precio, Object[][] productos) {
    ArrayList<String[]> productoEncontrado = new ArrayList<>();
    for (int i = 0; i < productos.length; i++) {
        double precio1 = (double) productos[i][3];
        if (precio1 == precio) {
            String codigoActual = (String) productos[i][0];
            String nombre = (String) productos[i][1];
            int cantidad = (int) productos[i][2];
            double precio3 = (double) productos[i][3];
            String descripcion = (String) productos[i][4];
            String proveedor = (String) productos[i][5];

            String[] fila = {codigoActual, nombre, Integer.toString(cantidad), Double.toString(precio3),
                    descripcion, proveedor};
            productoEncontrado.add(fila);
        }
    }
    if (productoEncontrado.isEmpty()) {
        System.out.println("Producto no encontrado: ");
        return productoEncontrado;
    }   return productoEncontrado;
}

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Busqueda por Texto">
public ArrayList<String> buscarProductoPorCodigo(String codigoBuscado, Object[][] productosAbarrotes) {
    ArrayList<String> productoEncontrado = new ArrayList<String>();

    for (int i = 0; i < productosAbarrotes.length; i++) {
        String codigoActual = (String) productosAbarrotes[i][0];
            if (codigoActual.equals(codigoBuscado)) {
            String nombre = (String) productosAbarrotes[i][1];
            int cantidad = (int) productosAbarrotes[i][2];
            double precio = (double) productosAbarrotes[i][3];
            String descripcion = (String) productosAbarrotes[i][4];
            String proveedor = (String) productosAbarrotes[i][5];

            productoEncontrado.add("Código: " + codigoActual);
            productoEncontrado.add("Nombre: " + nombre);
            productoEncontrado.add("Cantidad: " + cantidad);
            productoEncontrado.add("Precio: " + precio);
            productoEncontrado.add("Descripción: " + descripcion);
            productoEncontrado.add("Proveedor: " + proveedor);

            return productoEncontrado;
        }
    }

    productoEncontrado.add("Producto no encontrado");
    return productoEncontrado;
}

public ArrayList<String[]> buscarProductoPorNombre2(String nombreBuscado, Object[][] productosAbarrotes) {
    ArrayList<String[]> productoEncontrado = new ArrayList<>();

    for (int i = 0; i < productosAbarrotes.length; i++) {
         String nombre = (String) productosAbarrotes[i][1];
         
         if (nombre.equals(nombreBuscado)) {
            String codigoActual = (String) productosAbarrotes[i][0];
            int cantidad = (int) productosAbarrotes[i][2];
            double precio = (double) productosAbarrotes[i][3];
            String descripcion = (String) productosAbarrotes[i][4];
            String proveedor = (String) productosAbarrotes[i][5];

            String[] fila = {codigoActual, nombre, Integer.toString(cantidad), Double.toString(precio),
                    descripcion, proveedor};
            productoEncontrado.add(fila);
        }
    }
    if (productoEncontrado.isEmpty()) {
        System.out.println("Producto no encontrado: ");
        return productoEncontrado;
    }   return productoEncontrado;
}

public ArrayList<String[]> buscarProductoPorProovedor2(String proveedorBuscado, Object[][] productosAbarrotes) {
    ArrayList<String[]> productoEncontrado = new ArrayList<>();

    for (int i = 0; i < productosAbarrotes.length; i++) {
           String proveedor = (String) productosAbarrotes[i][5];
         if (proveedor.equals(proveedorBuscado)) {
            String codigoActual = (String) productosAbarrotes[i][0];
            int cantidad = (int) productosAbarrotes[i][2];
            double precio = (double) productosAbarrotes[i][3];
            String descripcion = (String) productosAbarrotes[i][4];
            String nombre = (String) productosAbarrotes[i][1];

            String[] fila = {codigoActual, nombre, Integer.toString(cantidad), Double.toString(precio),
                    descripcion, proveedor};
            productoEncontrado.add(fila);
        }
    }
    if (productoEncontrado.isEmpty()) {
        System.out.println("Producto no encontrado: ");
        return productoEncontrado;
    }   return productoEncontrado;
}

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Busqueda Por 2 Atributos">
public ArrayList<String[]> buscarProductoPorNombreYProveedor(String nombreBuscado, String proveedorBuscado, Object[][] productosAbarrotes) {
    ArrayList<String[]> productosEncontrados = new ArrayList<>();

    for (int i = 0; i < productosAbarrotes.length; i++) {
        String nombreActual = (String) productosAbarrotes[i][1];
        String proveedorActual = (String) productosAbarrotes[i][5];

        if (nombreActual.equalsIgnoreCase(nombreBuscado) && proveedorActual.equalsIgnoreCase(proveedorBuscado)) {
            String codigo = (String) productosAbarrotes[i][0];
            int cantidad = (int) productosAbarrotes[i][2];
            double precio = (double) productosAbarrotes[i][3];
            String descripcion = (String) productosAbarrotes[i][4];

            String[] fila = {codigo, nombreActual, Integer.toString(cantidad), Double.toString(precio),
                    descripcion, proveedorActual};
            productosEncontrados.add(fila);
        }
    }
    if (productosEncontrados.isEmpty()) {
        System.out.println("Producto no encontrado: ");
        return productosEncontrados;
    }   return productosEncontrados;
}

public ArrayList<String[]> buscarProductoPorStockYPrecio(int stockBuscado, Double precioBuscado, Object[][] productosAbarrotes) {
    ArrayList<String[]> productosEncontrados = new ArrayList<>();

    for (int i = 0; i < productosAbarrotes.length; i++) {
        int stockActual = (int) productosAbarrotes[i][2];
        double precioActual = (double) productosAbarrotes[i][3];

        if (stockActual == stockBuscado && precioActual == precioBuscado) {
            String codigo = (String) productosAbarrotes[i][0];
            int cantidad = (int) productosAbarrotes[i][2];
            double precio = (double) productosAbarrotes[i][3];
            String descripcion = (String) productosAbarrotes[i][4];
            String nombre = (String) productosAbarrotes[i][1];
            String proveedor = (String) productosAbarrotes[i][5];

            String[] fila = {codigo, nombre, Integer.toString(cantidad), Double.toString(precio),
                    descripcion, proveedor};
            productosEncontrados.add(fila);
        }
    }
    if (productosEncontrados.isEmpty()) {
        System.out.println("Producto no encontrado: ");
        return productosEncontrados;
    }   return productosEncontrados;
}

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Tipos de Busqueda">

    //Busqueda Secuencial por Nombre
    public  int busquedaSecuencialPorNombre(String nombre, Object[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i][1].equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    //Busqueda Binaria por Codigo
    public int busquedaBinaria(String codigoBuscado, Object[][] productosAbarrotes){
        int inicio = 0;
        int fin = productosAbarrotes.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (productosAbarrotes[medio][0].equals(codigoBuscado)) {
                return medio;
            } else if (codigoBuscado.compareTo((String) productosAbarrotes[medio][0]) < 0) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;
    }
    //</editor-fold>


}
