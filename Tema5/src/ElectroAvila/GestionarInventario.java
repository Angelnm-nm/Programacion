package ElectroAvila;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionarInventario {

    public static void main(String[] args) {

        List<Producto> entradaAlmacen = new ArrayList<>();
        entradaAlmacen.add(new Producto("LAV01", "Lavadora Bosch", 450.0, 10));
        entradaAlmacen.add(new Producto("TV02", "TV Samsung 60\"", 800.0, 5));
        entradaAlmacen.add(new Producto("LAV01", "Lavadora Bosch XL", 480.0, 2));
        entradaAlmacen.add(new Producto("PC03", "PC Gaming Nitro", 1200.0, 3));
        entradaAlmacen.add(new Producto("TV02", "TV Samsung OLED", 850.0, 1));
        entradaAlmacen.add(new Producto("MICRO04", "Microondas LG", 150.0, 20));

        System.out.println("--- 1. Detectados en bruto: " + entradaAlmacen.size() + " registros.");

        Set<Producto> productosUnicos = new HashSet<>(entradaAlmacen);
        List<Producto> listaLimpia = new ArrayList<>(productosUnicos);
        List<Producto> filtrados = new ArrayList<>();

        for (Producto p : listaLimpia) {
            if (p.getPrecioBase() > 300) {
                p.setPrecioBase(p.getPrecioBase() * 1.21);
                filtrados.add(p);
            }
        }

        filtrados.sort((a, b) -> b.getStock() - a.getStock());

        System.out.println("\n--- INVENTARIO FINAL (Precio > 300€, con IVA, ordenado por Stock) ---");

        for (Producto p : filtrados) {
            System.out.println(p);
        }
    }
}