package EjerciciosBasicos;

import java.util.Scanner;

public class EjerciciosBAsicos_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero del 1 al 7");
        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.println(numero+" lunes");
        }else if (numero == 2){
            System.out.println(numero+" martes");
        }else if (numero == 3){
            System.out.println(numero+" miercoles");
        }else if (numero == 4){
            System.out.println(numero+" jueves");
        }else if (numero == 5){
            System.out.println(numero+" viernes");
        }else if (numero == 6){
            System.out.println(numero+" sabado");
        }else if (numero == 7){
            System.out.println(numero+" domingo");

        }
    }
}
