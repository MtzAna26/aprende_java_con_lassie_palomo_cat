/* EJERCICIO 1. Lista de juguetes favoritos
 * Objetivo: Crear una lista, agregar elementos y mostrarlos.
 */

import java.util.ArrayList;

public class ListaJuguetes{
    public static void main(String[]args){
        ArrayList<String> juguetes = new ArrayList<>();
        
        juguetes.add("Pelota");
        juguetes.add("Cuerda");
        juguetes.add("Hueso");
        juguetes.add("Ratón de juguete");

        System.out.println("Juguetes favoritos de Lassie: ");
        for (String j : juguetes){
            System.out.println("- " + j);
        }
    }
 }