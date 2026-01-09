/*
Ejercicio 1: Crear una cola y agregar elementos
Crea una cola de números enteros y agrega los valores: 1,2,3

Aprendizaje:
add() inserta elementos al final de la cola
 */

import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio1_ColaBasica {
    public static void main(String[] args){
        Queue<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);

        System.out.println("Cola: " + cola);
    }
}