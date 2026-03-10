package EqualsHashCode.ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DetectorErrores {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> matriculas = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            String matricula = sc.nextLine();
            boolean prueba = matriculas.add(matricula);

            if (!prueba){
                System.out.println("ERROR");
            }
        }

    }

}
