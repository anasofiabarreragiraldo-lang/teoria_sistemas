import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioP02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = teclado.nextLine().toLowerCase();

        HashMap<Character, Integer> frecuencia = new HashMap<>();

        for (char letra : texto.toCharArray()) {

            if (letra != ' ') {

                if (frecuencia.containsKey(letra)) {
                    frecuencia.put(letra, frecuencia.get(letra) + 1);
                } else {
                    frecuencia.put(letra, 1);
                }
            }
        }

        ArrayList<Map.Entry<Character, Integer>> resultado =
                new ArrayList<>(frecuencia.entrySet());

        Collections.sort(resultado,
                Comparator.comparing(Map.Entry<Character, Integer>::getValue).reversed());

        System.out.println("\nFrecuencia de las letras:");

        for (Map.Entry<Character, Integer> dato : resultado) {
            System.out.println(dato.getKey() + " : " + dato.getValue());
        }
    }
}