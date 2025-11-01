# 🐾 Listas con Lassie

¡Guau! Hoy aprenderemos sobre **listas**, una estructura de datos que nos permite guardar varios elementos en orden.  
Imagina que Lassie tiene una fila de croquetas: puede agregar, quitar o ver cada una 🦴.

## 🦴 ¿Qué es una lista?
Una **lista** sirve para almacenar muchos datos del mismo tipo dentro de una sola variable.
Las listas son una colección de elementos organizados de manera secuencial, donde cada elemento tiene un sucesor y un predecesor.
En Java, podemos usar la clase **ArrayList**, que pertenece al paquete `java.util`.

---

## 💻 Primer ejemplo: Lista de mascotas

```java
import java.util.ArrayList;

public class ListaMascotas {
    public static void main(String[] args) {
        // Creamos una lista vacía de tipo String
        ArrayList<String> mascotas = new ArrayList<>();

        // Lassie agrega a sus amigos
        mascotas.add("Lassie");
        mascotas.add("Palomo");
        mascotas.add("Cat");

        // Mostramos todas las mascotas en la lista
        System.out.println("🐶 Lista de mascotas:");
        for (String nombre : mascotas) {
            System.out.println("- " + nombre);
        }
    }
}
```
🐶 Explicación paso a paso (por Lassie)

1) **import java.util.ArrayList;**
Le decimos a Java que usaremos la herramienta ArrayList, que ya viene incluida en el lenguaje.

2) **ArrayList<String> mascotas = new ArrayList<>();**
Creamos una lista para guardar nombres de tipo texto (String).
Ahora Lassie tiene su propia lista vacía para llenarla con nombres.

3) **mascotas.add("Lassie");**
Cada vez que usamos .add(), agregamos un nuevo amigo a la lista 🐾.

4) **for (String nombre : mascotas)**
Es un bucle que recorre todos los elementos y los muestra en pantalla.
