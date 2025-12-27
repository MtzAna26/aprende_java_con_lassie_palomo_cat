/*
EJERCICIO 4: VALIDAR PARENTESIS BALANCEADOS 
Objetivo: Determinar si una expresión tiene paréntesis correctamente 
balanceados. 
Ejemplos:
"(a + b)"        ✅ válido
"((a + b)"       ❌ inválido
"(a + b))"       ❌ inválido

Instrucciones: 
    1. Usa una pila
    2. Agrega ( cuando lo encuentres
    3. Elimina un elemento cuando encuentres )
    4. Al final, la pila debe estar vacía

    Concepto clave:
    Este problema es un clásico en una entrevista técnica

*/

import java.util.Stack;
public class Ejercicio_4 {

    public static void main(String[] args){
        String expresion = "(a + b)";
        System.out.println("¿Expresión válida? " + esBalanceada(expresion));
    }

    public static boolean esBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }

        return pila.isEmpty();
    }
}