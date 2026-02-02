/*
    Ejercicio 4: Edades gatitos
    
    Objetivo: Uso de arrays + bucle (muy básico y sencillo)
    
    Qué aprenderas:
    1. Arrays
    2. length
    3. Recorrer datos con "for"

    Enunciado:
    Cada gatito recibe comida. Hay 4 gatitos
*/

public class CatAges {
    public static void main(String[] args) {
        int [] CatAges = {1,2,3};

        for(int i = 0; i < CatAges.length; i++){
            System.out.println("La edad del gatito es: " + CatAges[i] + "años");
        }
    }
    
}
