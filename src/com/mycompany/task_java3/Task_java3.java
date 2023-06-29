/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_java3;

import metodos.CPunto4;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class Task_java3 {

    public static void main(String[] args) {
   
CPunto4 arbol = new CPunto4();
arbol.insertar(new Producto("AB001", "Arroz", 10, 1.5, "Arroz integral de grano largo", "San Fernando"));
arbol.insertar(new Producto("AB002", "Lentejas", 20, 2.5, "Lentejas secas", "Bartolome"));
arbol.insertar(new Producto("AB003", "Fideos", 30, 3.5, "Fideos Costeñita", "MarcoPolo"));
arbol.insertar(new Producto("AB004", "Azúcar", 15, 2.0, "Azúcar blanca refinada", "La Chancaca"));
arbol.insertar(new Producto("AB005", "Aceite", 12, 3.0, "Aceite vegetal", "Oliva"));
arbol.insertar(new Producto("AB006", "Sal", 8, 1.0, "Sal de mesa", "Salero"));
arbol.insertar(new Producto("AB007", "Leche", 25, 2.5, "Leche descremada", "La Vaquita"));
arbol.insertar(new Producto("AB008", "Harina", 18, 1.8, "Harina de trigo todo uso", "El Molino"));
arbol.insertar(new Producto("AB009", "Café", 10, 4.0, "Café molido", "El Cafetal"));
arbol.insertar(new Producto("AB010", "Mermelada", 5, 2.2, "Mermelada de frutas", "La Confitura"));

arbol.recorridoPostOrden();



    }
}
