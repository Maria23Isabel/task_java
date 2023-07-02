package metodos;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import modelo.Producto;

/**
 * 
 * @author maria
 */
public class TPunto3 {
public static void main(String[] args) {
        Hashtable<Object, Producto> ht = new Hashtable<>();

        Producto emp = new Producto();
        ht.put(emp.getProductosAbarrotes(), emp);

        emp = new Producto("AB001", "tt", 55, 12, "a", "s", 12);
        ht.put(emp.getCodigo(), emp);

        emp = new Producto("b", "rr", 44, 12, "a", "s", 12);
        ht.put(emp.getCodigo(), emp);

        emp = new Producto("c", "ss", 3, 12, "a", "s", 12);
        ht.put(emp.getCodigo(), emp);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese codigo a buscar:");
        String cod = entrada.next();
        System.out.println("" + ht.get(cod));

        Enumeration lista = ht.keys();
        while (lista.hasMoreElements()) {
            Object clave = (Object) lista.nextElement();
            Producto empx = ht.get(clave);
            System.out.println("" + empx.getCodigo() + "" + empx.getNombre());
        }
}
}
