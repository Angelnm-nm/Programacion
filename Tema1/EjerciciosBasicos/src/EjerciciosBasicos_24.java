package EjerciciosBasicos;

import java.util.Scanner;

public class EjerciciosBasicos_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9999: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("El número no está dentro del rango permitido.");
        } else {
            String numStr = String.valueOf(numero);
            String invertido = new StringBuilder(numStr).reverse().toString();
            if (numStr.equals(invertido)) {
                System.out.println("El número " + numero + " es capicúa.");
            } else {
                System.out.println("El número " + numero + " no es capicúa.");
            }
        }

        sc.close();
    }
}


