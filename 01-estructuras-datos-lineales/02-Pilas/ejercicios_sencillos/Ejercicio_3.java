/*
EJERCICIO 2: INVERTIR UNA PALABRA USANDO UNA PILA 
Objetivo: Invertir una cadena de texto usando unja pila de caracteres
Ejemplo:
Entrada: "java"
Salida: "avaj"
Instrucciones:
    1. Recorre la palabra
    2. Guarda cada caracter en una pila
    3. Extrae los caracteres y construye la palabra invertida
    Lassie dice: ¡Las pilas son geniales para invertir cosas!
*/

import java.util.Stack;

public class Ejercicio_3 {
    public static void main(String[] args){
       String palabra = "java";
       Stack<Character> pila = new Stack<>();
     
       // Guardar caracteres en la pila
        for (char c : palabra.toCharArray()) {
            pila.push(c);
        }

        // Construir palabra invertida
        StringBuilder invertida = new StringBuilder();
        while (!pila.isEmpty()){
            invertida.append(pila.pop());
        }

        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + invertida);
    }
}