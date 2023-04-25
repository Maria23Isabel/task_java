package clases;
/**
 *
 * @author maria
 */
public class Metodo_Ordenamiento {

    //<editor-fold defaultstate="collapsed" desc="Atributo Numerico">
    //Metodo de Shell Sort
    public void ordenarPrecio(Object[][] productos) {
        int n = productos.length;
        int mitad = n / 2;
            while (mitad > 0) {
                for (int i = mitad; i < n; i++) {
                    Object[] temp = productos[i];
                    System.err.println("aaaaaaaa" + i);
                    int j;
                        for (j = i; j >= mitad && (double) productos[j - mitad][3] > (double) temp[3]; j -= mitad) {
                            System.err.println( "primero" + productos[j - mitad][3]);
                            System.err.println( j - mitad);
                            System.err.println( "jota" + j);
                            System.err.println( "la mitad" + mitad);
                            System.err.println("segundo" + temp[3]);
                        productos[j] = productos[j - mitad];
                }
            productos[j] = temp;
        }
        mitad = mitad / 2;
    }
}

    public void ordenarStock(Object[][] productos) {
    int n = productos.length;
    int mitad = n / 2;
    while (mitad > 0) {
        for (int i = mitad; i < n; i++) {
            Object[] temp = productos[i];
            int j;
            for (j = i; j >= mitad && (int) productos[j - mitad][2] > (int) temp[2]; j -= mitad) {
                productos[j] = productos[j - mitad];
            }
            productos[j] = temp;
        }
        mitad = mitad / 2;
    }
}


    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Atributo String">
    //Ordenamiento Burbuja 
    public void ordenarCodigo(Object[][] productos) {
        int n = productos.length;
        boolean intercambio = false;
    do {
        intercambio = false;
        for (int i = 0; i < n - 1; i++) {
            String codigo1 = (String) productos[i][0];
            String codigo2 = (String) productos[i + 1][0];
            int num1 = Integer.parseInt(codigo1.substring(2));
            int num2 = Integer.parseInt(codigo2.substring(2));
            if (num1 > num2) {
                Object[] temp = productos[i];
                productos[i] = productos[i + 1];
                productos[i + 1] = temp;
                intercambio = true;
            }
        }
        n--;
    } while (intercambio);
}
    
    public void ordenarNombre(Object[][] productos) {
        int n = productos.length;
        boolean intercambio = false;
        do {
            intercambio = false;
            for (int i = 0; i < n - 1; i++) {
                if (((String) productos[i][1]).compareTo((String) productos[i + 1][1]) > 0) {
                    Object[] temp = productos[i];
                    productos[i] = productos[i + 1];
                    productos[i + 1] = temp;
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }
    
    public void ordenarProveedor(Object[][] productos) {
        int n = productos.length;
        boolean intercambio = false;
        do {
            intercambio = false;
            for (int i = 0; i < n - 1; i++) {
                if (((String) productos[i][5]).compareTo((String) productos[i + 1][5]) > 0) {
                    Object[] temp = productos[i];
                    productos[i] = productos[i + 1];
                    productos[i + 1] = temp;
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Dos Atributos">
    //Metodo de Seleccion
    public void ordenarPorSeleccion(Object[][] productos) {
    int n = productos.length;
    for (int i = 0; i < n - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if ((double) productos[j][3] < (double) productos[minIdx][3]) {
                minIdx = j;
            } else if ((double) productos[j][3] == (double) productos[minIdx][3] && ((String) productos[j][1]).compareTo((String) productos[minIdx][1]) < 0) {
                minIdx = j;
            }
        }
        // Intercambiar elementos
        Object[] temp = productos[minIdx];
        productos[minIdx] = productos[i];
        productos[i] = temp;
    }
}
    //</editor-fold>
  
}
