import java.util.ArrayList;

public class ListaMascotas {
    public static void main(String[]args){
        ArrayList<String> mascotas = new ArrayList<>();

        // Lassie agrega a sus amigos
        mascotas.add("Lassie");
        mascotas.add("Palomo");
        mascotas.add("Cat");

        System.out.println("🐶 Lista de mascotas:");
        for (String nombre : mascotas){
            System.out.println("- " + nombre);
        }
    }
}
