package EqualsHashCode.ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LimpiezaDeLista {
    static void main(String[] args) {


        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        HashSet <String> colorFinal = new HashSet<>(colores);
        System.out.println(colorFinal);

    }
}
