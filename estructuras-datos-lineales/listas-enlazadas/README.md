# 🐾 Listas Enlazadas con Lassie

¡Guau! Hoy aprenderemos cómo funcionan las **listas enlazadas**, una estructura donde cada elemento (nodo) guarda un dato y un enlace al siguiente.

## 🦴 ¿Qué es una lista enlazada?
Las listas enlazadas son estructuras de datos fundamentales que permiten almacenar colecciones de elementos de manera dinámica, utilizando nodos que están conectados entre sí mediante punteros.
Imagina una **cadena de collares**, donde cada collar (nodo) está conectado con el siguiente.  
Así, Lassie puede recorrer toda la cadena siguiendo los enlaces uno por uno 🐕➡️🐕➡️🐕.

---

## 💻 Ejemplo básico

```java
class Nodo {
    String dato;
    Nodo siguiente;

    Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class ListaEnlazada {
    Nodo cabeza;

    public void agregar(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("🐾 " + actual.dato);
            actual = actual.siguiente;
        }
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("Lassie");
        lista.agregar("Palomo");
        lista.agregar("Cat");

        System.out.println("🐕 Lista enlazada de mascotas:");
        lista.mostrar();
    }
}
