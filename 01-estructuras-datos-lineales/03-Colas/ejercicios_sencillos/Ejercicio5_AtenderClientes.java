/*
Ejercicio 5: Atender clientes en orden
Simula una fila de cleintes y atiéndelos uno por uno

Aprendizaje:
Las colas respetan el order la llegada (FIFO)
 */


import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio5_AtenderClientes {

    public static void main(String[] args){
        Queue<String> cola new LinkedList<>();

        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");

        while (!cola.isEmpty()) {
            System.out.println("Atendiendo: " + cola.poll());
        }
    }
}