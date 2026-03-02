package EjerciciosAvanzados;

import java.util.Scanner;

public class EjercicioFuncionesExamen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu edad");
        int edad = sc.nextInt();
        double precioinicial = 500;
        System.out.println("has tenido accidentes");
        boolean accidentes = sc.nextBoolean();

        double precioFinal = calcularSeguro(precioinicial, edad,accidentes);

        System.out.println(" precio segur0: " + precioFinal);

    }

    static double calcularSeguro(double precioinicial, int edad, boolean accidentes) {

        if (edad >= 18 && edad <= 25) {
            return precioinicial* 1.1;
        } else if (edad > 35 && edad > 55 && !accidentes) {
            return precioinicial * 0.9;

        } else if (edad > 65) {
            if (accidentes) {
            } else if (edad > 65 && !accidentes) {
                return precioinicial * 1.1;
            } else if (edad > 65 && accidentes) {
                return precioinicial * 1.3;

            }
        }
        return precioinicial;
    }
}