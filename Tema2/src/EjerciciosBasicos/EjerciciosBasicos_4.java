package EjerciciosBasicos;

import java.util.Scanner;

public class EjerciciosBasicos_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("ingre el sergundo numero");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
        } else {
            double resultado = num1 / num2;
            System.out.println("el resultado es " + resultado);

        }
        sc.close();

    }
}
