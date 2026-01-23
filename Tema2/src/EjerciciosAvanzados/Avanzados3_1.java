package EjerciciosAvanzados;

import java.util.Scanner;

public class Avanzados3_1 {
    //Implementa un metodo recursivo que determine si un número es primo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escribe el numero ");
        int numero= sc.nextInt();
        boolean esPrimo = esPrimo(numero, 2);

        if (esPrimo) {
            System.out.println(numero + " es primo ");
        } else {
            System.out.println(numero + " no es primo ");
        }

        sc.close();
    }
    static boolean esPrimo(int numero, int divisor) {

        if (numero <= 1) {
            return false;
        }

        if (divisor == numero) {
            return true;
        }

        if (numero % divisor == 0) {
            return false;
        }

        return esPrimo(numero, divisor + 1);
    }
}
