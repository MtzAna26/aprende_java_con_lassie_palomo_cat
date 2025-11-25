/*
 * Ejercicio 3. Lista de puntuaciones
 * Objetivo: Guardar números en una lista y calcular el promedio 
 */
import java.util.ArrayList;
public class ListaPuntuaciones {
    public static void main(String[]args){
        ArrayList<Integer> puntuaciones = new ArrayList<>();
        
        puntuaciones.add(8);
        puntuaciones.add(9);
        puntuaciones.add(10);
        puntuaciones.add(7);

        int suma = 0;
        for (int p : puntuaciones){
            suma += p;
        }

        double promedio = (double) suma / puntuaciones.size();
        System.out.println("Puntuaciones de Lassie: " + puntuaciones);
        System.out.println("Promedio: " + promedio);
    }
}
