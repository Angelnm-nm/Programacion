package Map;

import java.util.HashMap;

public class ej3 {
    static void main(String[] args) {
        HashMap<String, Double> nombres = new HashMap<>();
        nombres.put("Angel", 5.00);
        nombres.put("Ben", 2.50);
        nombres.put("Carlos", 3.99);
        nombres.put("Daniel", 4.80);

        for (String nombre1 : nombres.keySet()) {
            System.out.println("El alumno : " + nombre1 + " tiene una nota de " + nombres.get(nombre1));
        }

    }
}
