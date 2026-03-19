package Map;

import java.util.HashMap;
import java.util.Map;

public class ej5 {
    static void main(String[] args) {
        String[] lenguajes = {"Java", "Python", "Java", "C++", "Java", "Python"};
        Map<String, Integer> contarLenguaje = new HashMap<>();
        for (String lenguaje : lenguajes) {
            if (contarLenguaje.containsKey(lenguaje)) {
                contarLenguaje.put(lenguaje, contarLenguaje.get(lenguaje) + 1);
            } else {
                contarLenguaje.put(lenguaje, 1);
            }

        }
        System.out.println(contarLenguaje);
    }
}