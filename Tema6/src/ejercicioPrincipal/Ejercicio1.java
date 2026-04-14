package ejercicioPrincipal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un archivo");
        String nombre = sc.nextLine();
     sc.close();
     try {
         File file = new File(nombre);
         if (!file.exists())
             file.createNewFile();
         else
             System.out.println(file.getAbsolutePath());
     }catch (IOException e){
         System.out.println("Error al crear el archivo" + e.getMessage());
     }

    }
}
