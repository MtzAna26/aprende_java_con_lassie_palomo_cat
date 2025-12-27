/*
EJERCICIO 2: VERIFICAR SI UNA PILA ESTA VACIA
Objetivo: Comprobar si una pila tiene  elementos antes de hacer pop
Instrucciones:
    1. Crea una pila vacía 
    2. Verifica si esta vacía
    3. Agrega un elemento
    4. Vuelve a verficar

    Aprendizaje clave: Evitar errores al trabajar con pilas vacías
*/

import java.util.Stack;
public class Ejercicio_2 {

    public static void main(String[] args){
        Stack<String> pila = new Stack<>();
        System.out.println("¿La pila esta vacía? " + pila.isEmpty());

        pila.push("Lassie");
        System.out.println("¿La pila está vacia? " + pila.isEmpty());
    }
}