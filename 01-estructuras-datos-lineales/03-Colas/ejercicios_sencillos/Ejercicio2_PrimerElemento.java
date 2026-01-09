/*
Ejercicio 2: Mostrar el primer elemento de la cola
Muestra el primer elemento de una cola sin eliminarlo

Aprendizaje:
peek() permite ver el inicio sin modificar la cola
 */

import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio2_PrimerElemento {

    public static void main(String[] args){
        Queue<String> cola = new LinkedList<>();

        cola.add("A");
        cola.add("B");
        cola.add("C");

        System.out.println("Primer elemento: " + cola.peek());
    }
}