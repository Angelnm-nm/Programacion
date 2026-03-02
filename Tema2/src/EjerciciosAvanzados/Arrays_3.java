package EjerciciosAvanzados;

import java.util.Arrays;

public class Arrays_3 {
    static void main(String[] args) {
        int[] numeros1 = {1, 2, 3};
        int[] numeros2 = {4, 5, 6};

        System.out.println(Arrays.toString(numeros1));
        System.out.println(Arrays.toString(numeros2));

        int [][] numeros = {numeros1,numeros2};
        System.out.println("imprimimos el array de arrays");

        for (int [] numero : numeros){
            System.out.println(Arrays.toString(numero));
        }
    }
}