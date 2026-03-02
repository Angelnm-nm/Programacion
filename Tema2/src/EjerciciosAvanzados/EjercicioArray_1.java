package EjerciciosAvanzados;

import java.util.Arrays;
import java.util.Random;

public class EjercicioArray_1 {
    static void main(String[] args) {

        int[] numeroAleatorio = new int[20];
        for (int i = 0; i < numeroAleatorio.length; i++) {

            Random r = new Random();

            numeroAleatorio[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(numeroAleatorio));
    }
}