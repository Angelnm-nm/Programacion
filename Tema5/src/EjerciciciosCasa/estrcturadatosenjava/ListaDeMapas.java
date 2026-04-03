package EjerciciciosCasa.estrcturadatosenjava;

import java.util.*;

public class ListaDeMapas {
    static void main(String[] args) {

        List<Map<String, Object>> estudiantes = new ArrayList<>();
        HashMap<String, Object> estudiante1 = new HashMap<>();
        estudiante1.put("nombre", "Pedro");
        estudiante1.put("edad", 18);
        estudiante1.put("nota Final", 8.5);

        estudiantes.add(estudiante1);

    HashMap<String, Object> estudiante2 = new HashMap<>();
        estudiante2.put("nombre", "juan");
        estudiante2.put("edad", 17);
        estudiante2.put("nota Final", 6.5);

        estudiantes.add(estudiante2);

    HashMap<String, Object> estudiante3 = new HashMap<>();
        estudiante3.put("nombre", "laura");
        estudiante3.put("edad", 19);
        estudiante3.put("nota Final", 4.9);

        estudiantes.add(estudiante3);

    HashMap<String, Object> estudiante4 = new HashMap<>();
        estudiante4.put("nombre", "Sofia");
        estudiante4.put("edad", 19);
        estudiante4.put("nota Final", 10.0);

        estudiantes.add(estudiante4);

    HashMap<String, Object> estudiante5 = new HashMap<>();
        estudiante5.put("nombre", "Angel");
        estudiante5.put("edad", 20);
        estudiante5.put("nota Final", 5.0);

        estudiantes.add(estudiante5);


        System.out.println("Nombre de los estudiantes ");
        for (Map<String, Object> estudiante : estudiantes) {
            System.out.println(estudiante.get("nombre"));
        }
        for (Map<String, Object> estudiante : estudiantes) {
            double nota = (double) estudiante.get("nota Final");
            if (nota > 8){
                System.out.println(estudiante);
            }
        }
        estudiantes.sort(Comparator.comparing(e -> (int) e.get("edad")));
        System.out.println(estudiantes);
    }
}
