package EjerciciosBasicos;

import java.util.Scanner;

public class EjerciciosBasicos_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce los numeros se acabara al incluir 5 ceros");

        int numero = 0;
        int contador = 0;
        int suma=0;

        while (contador < 5) {
            numero= sc.nextInt();
            suma += numero;
            if (numero==0){
                contador ++;
            }
        }
        System.out.println("el resultado de la suma es"+ suma);

        sc.close();

    }

}
