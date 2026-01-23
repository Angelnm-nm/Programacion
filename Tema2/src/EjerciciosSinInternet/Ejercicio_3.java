package EjerciciosSinInternet;

import java.util.Scanner;

// Implementa un método que reciba un nombre y edad y muestre un mensaje personalizado
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es tu nombre");
        String nombre = sc.nextLine();
        System.out.println("que edad tienes");
        int edad = sc.nextInt();

        sc.close();
        nombreEdad(nombre,edad);


    }

     static void nombreEdad(String nombre, int edad) {
         System.out.println(" hola " + nombre + " tienes " + edad + " años ");

    }
}
