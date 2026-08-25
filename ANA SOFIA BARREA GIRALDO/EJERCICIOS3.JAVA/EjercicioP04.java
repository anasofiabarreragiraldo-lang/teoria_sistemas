import java.util.ArrayList;
import java.util.HashMap;

public class EjercicioP04 {
    public static void main(String[] args) {

        String[][] estudiantes = {
            {"Camila", "11A"},
            {"Julian", "11B"},
            {"Valentina", "11A"},
            {"Sofia", "11B"}
        };

        HashMap<String, ArrayList<String>> cursos = new HashMap<>();

        for (int i = 0; i < estudiantes.length; i++) {

            String nombre = estudiantes[i][0];
            String curso = estudiantes[i][1];

            if (cursos.containsKey(curso)) {
                cursos.get(curso).add(nombre);
            } else {
                ArrayList<String> lista = new ArrayList<>();
                lista.add(nombre);
                cursos.put(curso, lista);
            }
        }

        System.out.println("Estudiantes por curso:");

        for (String curso : cursos.keySet()) {
            System.out.println(curso + " : " + cursos.get(curso));
        }
    }
}