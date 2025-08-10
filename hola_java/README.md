# 🐶 ¡Hola Java con Lassie!

¡Bienvenida/o a tu primera aventura en Java! Hoy conoceremos qué es Java, para qué sirve y haremos nuestro primer programa.

## ¿Qué es Java?
Java es un lenguaje de programación orientado a objetos que se usa para crear aplicaciones, juegos, sitios web, programas para celulares y mucho más.  
Es famoso porque funciona en casi cualquier dispositivo y es muy usado en empresas, universidades y proyectos creativos.

## 📚 Nuestra primera historia
Lassie, Palomo y Cat quieren aprender a programar para crear una aplicación donde puedan registrar sus aventuras y comidas favoritas.  
Para empezar, necesitan saludar al mundo… ¡y a sus amigos humanos! 🐾

## 💻 Tu primer programa en Java
```java
public class HolaJava {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        System.out.println("Lassie, Palomo y Cat te saludan 🐶🐶🐱");
    }
}
```

## 🐶 Explicación del código (narrada por Lassie)

¡Guau! Soy **Lassie** y te explico qué hace tu primer programa en Java, con olor a croquetas y mucha emoción 🦴

### 1) ```public class HolaJava { ... }```
Mi **casita de código** se llama `HolaJava`. En Java todo vive dentro de una **clase**.
> Tip de Lassie: el archivo debe llamarse **HolaJava.java** para que no se confunda mi humano (el compilador).

### 2) ```public static void main(String[] args) { ... }```
Esta es la **puerta de entrada** del programa.  
Cuando lo ejecutas, Java entra por aquí primero.
> Es como cuando escucho la bolsa de croquetas: ¡aquí empieza la acción!

### 3) ```System.out.println("¡Hola, mundo!");```
Es un **ladrido en pantalla**.  
`println` imprime el mensaje y **salta a la siguiente línea**.
> El `;` es mi “listo, siguiente truco”.

### 4) ```System.out.println("Lassie, Palomo y Cat te saludan 🐶🐶🐱");```
Otro ladrido más, ahora saludando a mi manada.  
Por eso verás **dos líneas** de salida.

### 5) ```{` y `}```
Son las **vallas del patio**: marcan dónde empiezan y terminan la clase y el método.

---

## ▶️ ¿Cómo lo ejecuto?

Guarda el archivo como **HolaJava.java**, abre una terminal en esa carpeta y corre:

```bash ```
javac HolaJava.java


---
## Mini reto de Lassie 🦴

**Objetivo:** Agrega una tercera línea que imprima:
`Palomo y Cat también están listos 🐶🐱`

**Pista:** Recuerda que es `System.out.println` (con **n** al final).

```java
public class HolaJava {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        System.out.println("Lassie, Palomo y Cat te saludan 🐶🐶🐱");
        //  Escribe aquí tu nuevo println
    }
}