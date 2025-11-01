# 🐾 Listas con Lassie

¡Guau! Hoy aprenderemos sobre **listas**, una de las estructuras de datos más importantes en Java. 

Las listas permiten **guardar muchos elementos** en orden, como si fueran una fila de croquetas 🍖🍖🍖.

## 🦴 ¿Qué es una lista?
Las listas son una colección de elementos organizados de manera secuencial, donde cada elemento tiene un sucesor y un predecesor.
En Java, las más comunes son:
- **ArrayList**: tamaño dinámico (crece y se reduce automáticamente)
- **LinkedList**: usa nodos enlazados entre sí

## 💻 Ejemplo básico con ArrayList

```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> mascotas = new ArrayList<>();

        mascotas.add("Lassie");
        mascotas.add("Palomo");
        mascotas.add("Cat");

        System.out.println("🐶 Lista de mascotas:");
        for (String m : mascotas) {
            System.out.println("- " + m);
        }
    }
}
