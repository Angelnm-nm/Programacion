package parcticaClase.Avanzados;

import java.util.HashMap;
import java.util.Map;

public class e1 {
    static void main(String[] args) {
        Map<String,Map<String, Integer>>  ventas = new HashMap<>();

        ventas.putIfAbsent("Avila" , new HashMap<>());
        ventas.putIfAbsent("Burgos" , new HashMap<>());
        ventas.putIfAbsent("Segoiva" , new HashMap<>());

    }
}
