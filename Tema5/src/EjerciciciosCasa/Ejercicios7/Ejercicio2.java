package EjerciciciosCasa.Ejercicios7;

import EqualsHashCode.ejercicio1.HasSet;

import java.util.HashSet;

public class Ejercicio2 {
    static void main(String[] args) {
        HashSet<String> colores = new  HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Verde");

        System.out.println(colores);
        if (colores.contains("Verde")) {
            System.out.println("El color verde esta en el conjunto");
        }else  {
            System.out.println("El color verde NO esta en el conjunto");
        }

    }
}
