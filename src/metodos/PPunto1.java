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
            new Producto("AB005", "Aceite", 12, 3.0, "Aceite vegetal", "Oliva"),
            new Producto("AB006", "Sal", 8, 1.0, "Sal de mesa", "Salero"),
            new Producto("AB007", "Leche", 25, 2.5, "Leche descremada", "La Vaquita"),
            new Producto("AB008", "Harina", 18, 1.8, "Harina de trigo todo uso", "El Molino"),
            new Producto("AB009", "Café", 10, 4.0, "Café molido", "El Cafetal"),
            new Producto("AB010", "Mermelada", 5, 2.2, "Mermelada de frutas", "La Confitura")
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
