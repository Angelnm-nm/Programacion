package EjerciciciosCasa;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static void main(String[] args) {
        List <String> nombreAlumnos = new ArrayList<>();

        nombreAlumnos.add("Pablo");
        nombreAlumnos.add("Esteban");
        nombreAlumnos.add("Rafa");
        nombreAlumnos.add("Angel");
        nombreAlumnos.add("Humberto");
        nombreAlumnos.add(2,"Omar");


        int total = nombreAlumnos.size();
        System.out.println(total);
        nombreAlumnos.remove(total-1);

        System.out.println(nombreAlumnos);
    }
}
