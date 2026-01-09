/*
Ejercicio 3: Eliminar un elemento de la cola
Elimina el primer elemento de una cola y muestra la cola resultante

Aprendizaje:
poll() elimina el elemento del inicio de la cola
 */

import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio3_EliminarElemento {

    public static void main(String[] args){
        Queue<Integer> cola = new LinkedList<>();
        cola.add(10);
        cola.add(20);
        cola.add(30);

        cola.poll();
        System.out.println("Cola despues de eliminar: " + cola);
    }
}