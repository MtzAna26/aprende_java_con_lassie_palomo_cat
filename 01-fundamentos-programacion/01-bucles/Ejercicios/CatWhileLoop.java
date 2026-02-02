/*
    Ejercicio 2: Gatitos jugando (while)
    
    Objetivo: Aprender "while"
    
    Qué aprenderas:
    1. Condición en "while"
    2. Incremento manual
    3. Evitar bucles infinitos

    Enunciado:
    Mientras haya gatitos jugando, imprimer un mensaje
*/




public class CatWhileLoop {
    public static void main(String[] args) {

        int catsPlaying = 1;
        while (catsPlaying <= 3) {
            System.out.println("El gatito " + catsPlaying + "esta jugando");
            catsPlaying++;
        }
    }
}
