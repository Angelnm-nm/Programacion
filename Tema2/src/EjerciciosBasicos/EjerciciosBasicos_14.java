package EjerciciosBasicos;

import java.util.Scanner;

public class EjerciciosBasicos_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("digito de un numero");
            numero = sc.nextInt();
        } while (numero<0);{
            System.out.println(""+numero);
        }
    }
}
