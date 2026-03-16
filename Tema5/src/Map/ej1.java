package Map;

import java.util.HashMap;
import java.util.Scanner;

public class ej1 {
    static void main() {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Apple","Manzana");
        diccionario.put("Raton","Mouse");
        diccionario.put("Speak","Hablar");
        diccionario.put("Break","Romper");
        diccionario.put("Year","Año");

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra en ingles existente");
        String palabraIngles =  sc.nextLine();
        if (diccionario.containsKey(palabraIngles)){
         String traducido = diccionario.get(palabraIngles);
            System.out.println(traducido);
        }else{
            System.out.println("ERROR la palabra que intentas introducir no esta en el diccionarido");
        }




    }
}
