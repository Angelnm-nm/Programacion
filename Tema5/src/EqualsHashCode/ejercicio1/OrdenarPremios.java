package EqualsHashCode.ejercicio1;

import java.util.TreeSet;

public class OrdenarPremios {
    static void main(String[] args) {
        TreeSet <Integer> premioRifa = new TreeSet<>();
        premioRifa.add(45);
        premioRifa.add(12);
        premioRifa.add(89);
        premioRifa.add(3);
        premioRifa.add(22);

        for (Integer a : premioRifa ){
            System.out.println(a);
        }
    }
}
