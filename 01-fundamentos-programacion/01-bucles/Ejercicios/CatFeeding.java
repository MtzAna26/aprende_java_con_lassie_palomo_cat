/*
    Ejercicio 3: Alimentando gatitos
    
    Objetivo: Repetición con sentido lógico
    
    Qué aprenderas:
    1. Flujo completo del bucle
    2. Mensaje final fuera del bucle

    Enunciado:
    Cada gatito recibe comida. Hay 4 gatitos
*/


public class CatFeeding {
    public static void main(String[] args) {
        for (int cat = 1; cat <= 4; cat++){
            System.out.println("Dando comida al gatito: " + cat);
        }
        System.out.println("Todos los gatitos están alimentados");
    }
}
