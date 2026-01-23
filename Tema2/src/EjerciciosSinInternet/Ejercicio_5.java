package EjerciciosSinInternet;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el valor1");
        int a = sc.nextInt();
        System.out.println("ingresa el valor2");
        int b = sc.nextInt();
        System.out.println("ingresa el valor3");
        int c = sc.nextInt();

        sc.close();
        int numeroMayor = maximo(a,b,c);
        System.out.println("el numero mayor es "+ numeroMayor);


    }
    static int maximo (int a, int b,int c){
        if (a>=b && a>=c) {
            return a;
        }else if (b>=a && b>=c) {
            return b;
        }else {
            return c;
        }
    }
}