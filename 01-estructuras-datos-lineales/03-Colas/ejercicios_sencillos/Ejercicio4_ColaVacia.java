/*
Ejercicio 4: Verificar si la cola esta vacia
Comprueba si una cola esta vacia antes y despues de agregar un elemento

Aprendizaje:
Evita errores validando siempre isEmpty()
 */

import.util.Queue;
import java.util.LinkedList;

public class Ejercicio4_ColaVacia {

    public static void main(String[] args){
        Queue<String> cola = new LinkedList<>();

        System.out.println("¿Cola vacia? " + cola.isEmpty());
        cola.add("Lassie");

        System.out.println("¿Cola vacia? " + cola.isEmpty());
    }
}