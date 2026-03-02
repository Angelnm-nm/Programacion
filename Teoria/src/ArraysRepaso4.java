import java.util.Arrays;

public class ArraysRepaso4 {
    static void main(String[] args) {


        int[] numeros = {7, 4, 9};

        System.out.println(Arrays.toString(numeros));

        int[] temp = numeros;
        numeros = new int[4];
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(numeros));


    }
}