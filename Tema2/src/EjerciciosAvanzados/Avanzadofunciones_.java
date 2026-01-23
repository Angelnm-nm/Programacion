package EjerciciosAvanzados;

import java.util.Scanner;

public class Avanzadofunciones_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu edad");
        int edad = sc.nextInt();

        double precioInicial = 900;

        System.out.println("has tenido accidentes(TRUE OR FALSE)");
        boolean accidentes = sc.nextBoolean();

        System.out.println("tipo de seguro que tienes");
        String tipoDeSeguro = String.valueOf(sc.nextInt());

        System.out.println("tiempo que llevasen el seguro");
        int tiempoEnSeguro = sc.nextInt();

        System.out.println("edad del vehiculo");
        int edadCoche = sc.nextInt();

        System.out.println("de que color es tu coche");
        String colorCoche = String.valueOf(sc.nextInt());

    }
    static int CalcularSeguro  (int edad, double precioInicial, boolean accidentes, String tipoDeSeguro, int tiempoEnSeguro, int edadCoche, String colorCoche){
        if (edad < 18) {
            return 0;
        }else if (edad >18 && edad< 25){

        }
        return edad;
    }
}
