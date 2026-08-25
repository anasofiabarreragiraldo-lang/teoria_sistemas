import java.util.HashMap;
import java.util.Scanner;

public class EjercicioP01 {
    public static void main(String[] args) {

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Camila", "3001234567");
        agenda.put("Julian", "3012345678");
        agenda.put("Valentina", "3023456789");
        agenda.put("Sofia", "3034567890");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = teclado.nextLine();

        if (agenda.containsKey(nombre)) {
            System.out.println("El teléfono de " + nombre + " es: " + agenda.get(nombre));
        } else {
            System.out.println("Contacto no encontrado");
        }
    }
}