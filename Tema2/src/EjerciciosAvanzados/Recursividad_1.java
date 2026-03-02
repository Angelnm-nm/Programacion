package EjerciciosAvanzados;

public class Recursividad_1 {
    static void main(String[] args) {
        String hola ="hola";
        System.out.println(hola.charAt(0));
        System.out.println(hola.substring(1));

        cadenilla (hola);


    }
    static void cadenilla (String cadena){
        System.out.println(cadena.charAt(0));
        String subcadena = String.valueOf(1);
        if (subcadena.length() > 0) {
            cadenilla(subcadena);
        }
    }
}
