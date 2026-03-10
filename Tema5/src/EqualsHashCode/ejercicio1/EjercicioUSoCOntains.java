package EqualsHashCode.ejercicio1;

import java.util.HashSet;
import java.util.Scanner;

public class EjercicioUSoCOntains {
    static void main(String[] args) {

        HashSet<Integer> IDs = new HashSet<>();
        IDs.add(1);
        IDs.add(2);
        IDs.add(3);
        IDs.add(4);
        IDs.add(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el id ");
        int nuevoId = sc.nextInt();
        sc.close();
        boolean acceder = IDs.contains(nuevoId);
        System.out.println(acceder);



    }

}
