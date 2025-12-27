/*
Ejercicio 5: Simular el botón "Deshacer"
Objetivo: Simular un historial de acciones una pila

Ejemplo: 
- Escribir "Hola"
- Escribir "Mundo"
- Deshacer → elimina "Mundo"

Instrucciones: 
    1. Usa una pila de String 
    2. Cada acción se guarda en la pila
    3. Al deshacer, se hace pop()
*/

import java.util.Stack;
public class Ejervcicio_5 {

    public static void main(String[] args){

        Stack<String> historial = new Stack<>();
        
        historial.push("Escribir: Hola");
        historial.push("Escribir: Mundo");

        System.out.println("Ultima accion: " + historial.peek());

        // deshacer
        String accionDeshecha = historial.pop();
        System.out.println("accionDeshecha: " + accionDeshecha);
        System.out.println("Accion actual: " + historial.peek());
    }
}