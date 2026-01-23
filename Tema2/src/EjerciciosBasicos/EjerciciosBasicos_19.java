package EjerciciosBasicos;

import java.util.Scanner;

public class EjerciciosBasicos_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el numero");
        int numero = sc.nextInt();
        System.out.println("impar menor que" + numero);

        for (int i = 1; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }
        sc.close();
    }
}
