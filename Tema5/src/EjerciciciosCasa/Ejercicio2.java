package EjerciciciosCasa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nombreAlumnos = new ArrayList<>();

        nombreAlumnos.add("Pablo");
        nombreAlumnos.add("Esteban");
        nombreAlumnos.add("Rafa");
        nombreAlumnos.add("Angel");
        nombreAlumnos.add("Humberto");
        nombreAlumnos.add(2, "Omar");


        System.out.println("Escribe el nombre del alumno que quieres buscar");
        String buscar = sc.nextLine();

        for (int i = 0; i < nombreAlumnos.size(); i++) {
            if (nombreAlumnos.get(i).equals(buscar)) {
                System.out.println(nombreAlumnos.get(i).toUpperCase());

            } else {
                System.out.println(nombreAlumnos.get(i));
            }

        }
        //for (String nombreAlumno : nombreAlumnos){
        //   System.out.println(nombreAlumno);
        // }


        sc.close();
    }
}

