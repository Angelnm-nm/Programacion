package EqualsHashCode.ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;

public class LimpiezaDeLista {
    static void main(String[] args) {


        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        HashSet <String> colorFinal = new HashSet<>(colores);
        System.out.println(colorFinal);

    }
}
