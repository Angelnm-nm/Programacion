package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ej2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    Map<Integer, String> claveD = new HashMap<>();
    claveD.put(111,"Cola");

        System.out.println("Escribe el codigo del producto");
        int codigoProducto = sc.nextInt();

    if (claveD.containsKey(codigoProducto)){
        System.out.println(codigoProducto);
    }
    }
}