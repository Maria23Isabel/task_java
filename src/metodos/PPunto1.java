package metodos;

import javax.swing.DefaultListModel;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class PPunto1 {

    private Producto[] elementos;
    DefaultListModel listData = new DefaultListModel();

    public PPunto1() {
        elementos = new Producto[25];
        elementos[0] = new Producto("AB001", "Arroz", 10, 1.5, "Arroz integral de grano largo", "San Fernando");
        elementos[1] = new Producto("AB002", "Lentejas", 20, 2.5, "Lentejas secas", "Bartolome");
        elementos[2] = new Producto("AB003", "Fideos", 30, 3.5, "Fideos Costeñita", "MarcoPolo");
        elementos[3] = new Producto("AB004", "Azúcar", 15, 2.0, "Azúcar blanca refinada", "La Chancaca");
    }

    public int AgregarProducto(Producto producto) {
        int fila = 0;
        if (producto != null) {
            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] != null) {
                    fila++;
                }
            }
            elementos[fila] = producto;
            return 200;
        } else {
            return 500;
        }
    }

    public DefaultListModel mostrarRecursivo(int fila) {

        Producto[] lista = elementos;
        String cadena = "";
        if (fila != lista.length) {

            if (lista[fila] != null) {
                String codigo = lista[fila].getCodigo();
                String nombre = lista[fila].getNombre();
                String stock = String.valueOf(lista[fila].getStock());

                cadena = "codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + "\n";

                listData.addElement(cadena);

                fila++;

                mostrarRecursivo(fila);

                return listData;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public int sumarValores(int posArray) {
        Producto[] array = elementos;

        int tam = posArray;
        int rta;
        if (tam == 0) {
            return 0;
        } else {
            if (array[tam - 1] != null) {
                rta = (array[tam - 1].getStock()) + sumarValores(tam - 1);
                return rta;
            } else {
                return 0;
            }
        }
    }
}
