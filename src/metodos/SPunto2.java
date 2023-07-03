package metodos;

import modelo.Producto;

/**
 * 
 * @author maria
 */
public class SPunto2 {
    private Producto[] productos;
    private int cantidad;

    public SPunto2 (int cantidad) {
        this.cantidad = cantidad;
        this.productos = new Producto[cantidad];
    }

    public Producto[] getProducto1() {
        return productos;
    }

    private int calcularindice(String codigo) {
    // Implementa función de hash
    // Por ejemplo, podrías sumar los valores ASCII de los caracteres de la clave
    int i;
    int suma = 0;
    for (i = 0; i < codigo.length(); i++) {
        suma += (int) codigo.charAt(i);
    }
    
    // Aplica alguna función adicional si es necesario, como tomar el módulo
    int indice = suma % 10;
    
    return indice;
    }

    public int agregarProducto(Producto  p) {
        int index = calcularindice(p.getCodigo());
        int cont = 1;
        while (productos[index] != null) {
           index= (index + cont) % cantidad;
            cont++;

            if (cont > cantidad) {
                return 500;
            }
        } 
        productos[index]= new Producto(p.getCodigo(), p.getNombre(), p.getStock(), p.getPrecio(), p.getDescripcion(), p.getProvedor());
        return 200;
    }

    public String mostrarProducto() {
        StringBuilder stb = new StringBuilder();

        for (Producto producto : productos) {
            if (producto != null) {
                stb.append("Código : ").append(producto.getCodigo()).append(", ");
                stb.append("Nombre : ").append(producto.getNombre()).append(", ");
                stb.append("Stock : ").append(producto.getStock()).append(", ");
                stb.append("Precio : ").append(producto.getPrecio()).append(", ");
                stb.append("Descripción : ").append(producto.getDescripcion()).append(", ");
                stb.append("Proveedor : ").append(producto.getProvedor()).append("\n");
            } else{
                stb.append("*************************************************************************").append("\n");
            }
        }
        return stb.toString();
    }
}
