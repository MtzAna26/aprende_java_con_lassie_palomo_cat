/*
Ejercicio 1. Pila básica

Objetivo: Implementar una pila usando Stack<Integer> de java

Instrucciones.
    1. Crea una pila de números enteros
    2. Agrega los valores: 10, 20, 30
    3. Muestra el elemento superior
    4. Elimina un elemento
    5. Muestar el nuevo elemento superior.
    Pista de Lassie:
    Usa push(), pop() y peek()

*/

import java.util.Stack;
public class Ejercicio_1 {

    public static void main(String[] args){
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Elemento superior: " + pila.peek());

        // elimina elemento superior
        pila.pop();

        System.out.println("Nuevo elemento superior: " + pila.peek());
    }
}