package EjerciciosBasicos;

import java.util.Scanner;

public class EjeciciosBasicos_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon la cantidad de numeros para hacer la media");
        int cantidad= sc.nextInt();
        double suma = 0;
        for (int i=0; i< cantidad; i++) {
            System.out.println("escribe el numero");
            double numeros = sc.nextDouble();
            suma= suma +numeros;
        }
        System.out.println("la media es" + suma / cantidad);
        sc.close();
    }

    public static class EjerciciosBasicos_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("introduce numero entero");
            int numero = sc.nextInt();

            if (numero%2 ==0) {
                System.out.println(numero + " es par");
            }else {
                System.out.println(numero +" es impar");
            }
            sc.close();
        }
    }
}
