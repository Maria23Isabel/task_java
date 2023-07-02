package metodos;

import modelo.NodoABB;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class CPunto4 {

    NodoABB raiz;

    public int insertar(Producto producto) {
        NodoABB nuevo = new NodoABB(producto);

        if (raiz == null) {
            raiz = nuevo;
            return 200;
        } else {
            NodoABB actual = raiz;
            NodoABB padre;

            while (true) {
                padre = actual;

                if (producto.getNombre().compareToIgnoreCase(actual.producto.getNombre()) < 0) {
                    actual = actual.izquierdo;

                    if (actual == null) {
                        padre.izquierdo = nuevo;
                        return 200;
                    }
                } else {
                    actual = actual.derecho;

                    if (actual == null) {
                        padre.derecho = nuevo;
                        return 200;
                    }
                }
            }
        }
    }

    //<editor-fold defaultstate="collapsed" desc="Tipos de Arbol">
    private void preOrden(NodoABB nodo, StringBuilder cadena) {
        if (nodo != null) {
            cadena.append(nodo.producto.getNombre()).append(" ");
            preOrden(nodo.izquierdo, cadena);
            preOrden(nodo.derecho, cadena);
        }
    }

    private void inOrden(NodoABB nodo, StringBuilder cadena) {
        if (nodo != null) {
            inOrden(nodo.izquierdo, cadena);
            cadena.append(nodo.producto.getNombre()).append(" ");
            inOrden(nodo.derecho, cadena);
        }
    }

    private void postOrden(NodoABB nodo, StringBuilder cadena) {
        if (nodo != null) {
            postOrden(nodo.izquierdo, cadena);
            postOrden(nodo.derecho, cadena);
            cadena.append(nodo.producto.getNombre()).append(" ");
        }
    }

    public String muestraValores(int opcion) {
        StringBuilder cadena = new StringBuilder();

        switch (opcion) {
            case 1:
                preOrden(raiz, cadena);
                break;
            case 2:
                inOrden(raiz, cadena);
                break;
            case 3:
                postOrden(raiz, cadena);
                break;
            case 4:
                mostrarRegistrosRecursivo(raiz, cadena);
                break;
            default:
                break;
        }

        return cadena.toString();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Busqueda por Tipos de Arbol">
    public Producto buscaValores(String nombre, int opcion) {
        NodoABB p = raiz;

        switch (opcion) {
            case 1:
                return buscaValorInOrden(p, nombre);
            case 2:
                return buscaValorPreOrden(p, nombre);
            case 3:
                return buscaValorPostOrden(p, nombre);
            default:
                return null;
        }
    }

    private Producto buscaValorInOrden(NodoABB p, String nombre) {
        if (p != null) {
            Producto resultadoIzquierdo = buscaValorInOrden(p.izquierdo, nombre);

            if (resultadoIzquierdo != null) {
                return resultadoIzquierdo;
            }

            if (nombre.equalsIgnoreCase(p.producto.getNombre())) {
                return p.producto;
            }

            return buscaValorInOrden(p.derecho, nombre);
        }

        return null;
    }

    private Producto buscaValorPreOrden(NodoABB p, String nombre) {
        if (p != null) {
            if (nombre.equalsIgnoreCase(p.producto.getNombre())) {
                return p.producto;
            }

            Producto resultadoIzquierdo = buscaValorPreOrden(p.izquierdo, nombre);

            if (resultadoIzquierdo != null) {
                return resultadoIzquierdo;
            }

            return buscaValorPreOrden(p.derecho, nombre);
        }

        return null;
    }

    private Producto buscaValorPostOrden(NodoABB p, String nombre) {
        if (p != null) {
            Producto resultadoIzquierdo = buscaValorPostOrden(p.izquierdo, nombre);

            if (resultadoIzquierdo != null) {
                return resultadoIzquierdo;
            }

            Producto resultadoDerecho = buscaValorPostOrden(p.derecho, nombre);

            if (resultadoDerecho != null) {
                return resultadoDerecho;
            }

            if (nombre.equalsIgnoreCase(p.producto.getNombre())) {
                return p.producto;
            }
        }

        return null;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Eliminar Arbol">
    public boolean eliminaNodo(String nombre) {
        NodoABB auxiliar = raiz;
        NodoABB padre = raiz;
        boolean esHijoIzq = true;

        while (auxiliar != null && !auxiliar.producto.getNombre().equalsIgnoreCase(nombre)) {
            padre = auxiliar;

            if (nombre.compareToIgnoreCase(auxiliar.producto.getNombre()) < 0) {
                esHijoIzq = true;
                auxiliar = auxiliar.izquierdo;
            } else {
                esHijoIzq = false;
                auxiliar = auxiliar.derecho;
            }
        }

        if (auxiliar == null) {
            return false;
        }

        // Caso 1: El nodo a eliminar es una hoja
        if (auxiliar.izquierdo == null && auxiliar.derecho == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (esHijoIzq) {
                padre.izquierdo = null;
            } else {
                padre.derecho = null;
            }
        } // Caso 2: El nodo a eliminar tiene solo un hijo
        else if (auxiliar.derecho == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.izquierdo;
            } else if (esHijoIzq) {
                padre.izquierdo = auxiliar.izquierdo;
            } else {
                padre.derecho = auxiliar.izquierdo;
            }
        } else if (auxiliar.izquierdo == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.derecho;
            } else if (esHijoIzq) {
                padre.izquierdo = auxiliar.derecho;
            } else {
                padre.derecho = auxiliar.derecho;
            }
        } // Caso 3: El nodo a eliminar tiene dos hijos
        else {
            NodoABB sucesor = obtenerSucesor(auxiliar);

            if (auxiliar == raiz) {
                raiz = sucesor;
            } else if (esHijoIzq) {
                padre.izquierdo = sucesor;
            } else {
                padre.derecho = sucesor;
            }

            sucesor.izquierdo = auxiliar.izquierdo;
        }

        return true;
    }

// Método para obtener el sucesor de un nodo (el nodo más a la izquierda del subárbol derecho)
    private NodoABB obtenerSucesor(NodoABB nodo) {
        NodoABB padreSucesor = nodo;
        NodoABB sucesor = nodo;
        NodoABB actual = nodo.derecho;

        while (actual != null) {
            padreSucesor = sucesor;
            sucesor = actual;
            actual = actual.izquierdo;
        }

        if (sucesor != nodo.derecho) {
            padreSucesor.izquierdo = sucesor.derecho;
            sucesor.derecho = nodo.derecho;
        }

        return sucesor;
    }
    //</editor-fold>

        
private void mostrarRegistrosRecursivo(NodoABB nodo, StringBuilder sb) {
    if (nodo == null) {
        return;
    }
    
    mostrarRegistrosRecursivo(nodo.izquierdo, sb);
    Producto producto = nodo.producto;
    sb.append("Código: ").append(producto.getCodigo())
      .append(", Nombre: ").append(producto.getNombre())
      .append(", Stock: ").append(producto.getStock())
      .append(", Precio: ").append(producto.getPrecio())
      .append(", Descripción: ").append(producto.getDescripcion())
      // Agrega aquí todos los campos adicionales que desees mostrar
      .append("\n");
    mostrarRegistrosRecursivo(nodo.derecho, sb);
}

}
