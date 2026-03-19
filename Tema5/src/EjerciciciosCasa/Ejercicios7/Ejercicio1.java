package EjerciciciosCasa.Ejercicios7;

import java.util.ArrayList;

public class Ejercicio1 {
    static void main(String[] args) {
        ArrayList<String> tareasPendientes = new ArrayList<>();
        tareasPendientes.add("Recoger");
        tareasPendientes.add("Barrer");
        tareasPendientes.add("Fregar");
        tareasPendientes.add("LimpiarPolvo");

        System.out.println(tareasPendientes);
        tareasPendientes.remove(2);
        System.out.println(tareasPendientes);
    }
}