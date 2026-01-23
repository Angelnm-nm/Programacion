package EjerciciosSinInternet;

import java.util.Scanner;

// Escribe un métofo para calcular el area de un rectangulo dados base y altura
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce base");
        int base = sc.nextInt();

        System.out.println("introduce altura");
        int altura = sc.nextInt();
        sc.close();
        area (base , altura);

    }
    static void area (int base , int altura){
        System.out.println("el area es"+  base * altura);

    }
}
