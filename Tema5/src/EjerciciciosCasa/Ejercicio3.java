package EjerciciciosCasa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {
    static void main(String[] args) {
        Random random = new Random();
        int resultado = 0;
        int mayor = 0;
        List<Integer> primitivos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            primitivos.add(random.nextInt(1, 50));

        }
        System.out.println(primitivos);
        for (int i = 0; i < primitivos.size(); i++) {
            int suma = (int) primitivos.get(i);
            resultado += suma;

        }
        System.out.println(resultado);

        for (int i = 0; i < primitivos.size(); i++) {
            if (mayor < primitivos.get(i)) {
                mayor = primitivos.get(i);
            }
        }
        System.out.println(mayor);
    }
}
