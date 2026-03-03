package EjerciciciosCasa;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    static void main(String[] args) {
        int[] notasArray = {4, 9, 7, 5, 10};
        List<Integer> primitivos = new ArrayList<>();

        for (int i = 0; i < notasArray.length ; i++) {
          primitivos.add(notasArray[i]);
        }
        for (Integer numero : primitivos){
            String numeroString = numero.toString();
            System.out.println(numeroString);
        }
    }
}
