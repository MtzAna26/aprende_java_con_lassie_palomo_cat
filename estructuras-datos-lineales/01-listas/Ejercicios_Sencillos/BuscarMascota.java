/* Ejercicio 2: Buscar un elemento en la lista
 * Objetivo. Usar contains() para verificar si un elemento está dentro
 * de la lista.
 */

import java.util.ArrayList;

public class BuscarMascota {
    public static void main(String[]args){
        ArrayList<String> mascotas = new ArrayList<>();
        mascotas.add("Lassie");
        mascotas.add("Cat");
        mascotas.add("Palomo");

        String nombreBuscado = "Cat";

        if (mascotas.contains(nombreBuscado)){
            System.out.println(nombreBuscado + " Esta en la lista :)");
        } else {
            System.out.println(nombreBuscado + "No esta en la lista :(");
        }
    }
}
