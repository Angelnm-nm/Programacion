package EjerciciciosCasa.bibliotecaMunicipal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Biblioteca {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> libroUsuarioDias = new HashMap<>();

        // Libro BK101
        Map<String, Integer> usuariosBK101 = new HashMap<>();
        usuariosBK101.put("12345678A", 5);
        usuariosBK101.put("87654321B", 12);
        usuariosBK101.put("11223344C", 7);
        libroUsuarioDias.put("BK101", usuariosBK101);

        // Libro BK202
        Map<String, Integer> usuariosBK202 = new HashMap<>();
        usuariosBK202.put("44332211D", 3);
        usuariosBK202.put("55667788E", 9);
        usuariosBK202.put("99887766F", 4);
        libroUsuarioDias.put("BK202", usuariosBK202);

        // Libro BK303
        Map<String, Integer> usuariosBK303 = new HashMap<>();
        usuariosBK303.put("12345678A", 2); // repetido
        usuariosBK303.put("33445566G", 15);
        usuariosBK303.put("77889900H", 6);
        libroUsuarioDias.put("BK303", usuariosBK303);

        // Libro BK404
        Map<String, Integer> usuariosBK404 = new HashMap<>();
        usuariosBK404.put("22334455J", 8);
        usuariosBK404.put("11223344C", 10); // repetido
        usuariosBK404.put("44332211D", 5);  // repetido
        libroUsuarioDias.put("BK404", usuariosBK404);

        // Libro BK505
        Map<String, Integer> usuariosBK505 = new HashMap<>();
        usuariosBK505.put("99001122M", 11);
        usuariosBK505.put("55667788E", 4); // repetido
        usuariosBK505.put("77889900H", 7); // repetido
        usuariosBK505.put("11998877P", 3);
        libroUsuarioDias.put("BK505", usuariosBK505);

        // TODO - Generar un set con los códigos de libro
        System.out.println(getCodigosLibros(libroUsuarioDias));

        // TODO - Mostrar el préstamo más largo
        System.out.printf(
                "El préstamo más largo ha sido de %d días%n",
                getPrestamoMasLargo(libroUsuarioDias)
        );

        // TODO - Crear un Map que la clave sea el libro y el value la media de días prestados
        System.out.println(
                "La media de días por libro es " +
                        getMediaDiasPorLibro(libroUsuarioDias)
        );

        // TODO - Crear un MAP que la clave sea el DNI y el value los días totales prestados
        System.out.println(
                "Los días totales por usuario son " +
                        getDiasTotalesPorUsuario(libroUsuarioDias)
        );
    }

    public static Set<String> getCodigosLibros(
            Map<String, Map<String, Integer>> datos
    ) {
        // TODO
        return null;
    }

    public static Integer getPrestamoMasLargo(
            Map<String, Map<String, Integer>> datos
    ) {
        // TODO
        return 0;
    }

    public static Map<String, Double> getMediaDiasPorLibro(
            Map<String, Map<String, Integer>> datos
    ) {
        // TODO
        return null;
    }

    public static Map<String, Integer> getDiasTotalesPorUsuario(
            Map<String, Map<String, Integer>> datos
    ) {
        // TODO
        return null;
    }
}

