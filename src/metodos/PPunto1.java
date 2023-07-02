package metodos;

import javax.swing.DefaultListModel;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class PPunto1 {

    private Producto[] elementos;

    public PPunto1() {
        elementos = new Producto[]{
            new Producto("AB001", "Arroz", 10, 1.5, "Arroz integral de grano largo", "San Fernando"),
            new Producto("AB002", "Lentejas", 20, 2.5, "Lentejas secas", "Bartolome"),
            new Producto("AB003", "Fideos", 30, 3.5, "Fideos Costeñita", "MarcoPolo"),
            new Producto("AB004", "Azúcar", 15, 2.0, "Azúcar blanca refinada", "La Chancaca"),
        };
    }

    DefaultListModel listData = new DefaultListModel();

    public DefaultListModel mostrarRecursivo(int fila) {

        Producto[] lista = elementos;

        String cadena = "";
        if (fila != lista.length) {

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
    }

    public int sumarValores(int posArray) {
        Producto[] array = elementos;

        int tam = posArray;
        int rta;
        if (tam == 0) {
            return 0;
        } else {
            rta = (array[tam - 1].getStock()) + sumarValores(tam - 1);
        }
        return rta;
    }
}
