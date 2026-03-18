package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ej2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<Integer, String> claveD = new HashMap<>();
        claveD.put(111, "Cola");
        claveD.put(222, "Perro");
        claveD.put(333, "Arandano");

        System.out.println("Escribe el codigo del producto");
        int codigoProducto = sc.nextInt();

        if (claveD.containsKey(codigoProducto)) {
            System.out.println("El código ya existe");
        } else {
            System.out.println("Escribe el nombre del prdcutos");
            String nombreProducto = sc.next();
            claveD.put(codigoProducto, nombreProducto);
        }
        for (Integer codigo : claveD.keySet()) {
            System.out.println("codigo: " + codigo + ": producto: " + claveD.get(codigo));

        }
    }
}