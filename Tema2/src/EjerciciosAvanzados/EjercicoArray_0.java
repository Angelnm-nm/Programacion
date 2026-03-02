package EjerciciosAvanzados;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicoArray_0 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eligue el numero que quieres que te diga cuantas veces esta adentro de la arraid");
        int numero = sc.nextInt();

        int contador =0;


        int[] numeroAleatorio = new int[20];
        for (int i = 0; i < numeroAleatorio.length ; i++) {

            Random r = new Random();

            numeroAleatorio[i] = r.nextInt(10);
            if (numeroAleatorio [i] == numero){
                contador=contador+1;
            }
        }
        System.out.println(Arrays.toString(numeroAleatorio));
        System.out.println("el numero se repite " + contador + " veces");
        sc.close();

    }
}
