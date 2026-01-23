package EjerciciosAvanzados;

public class Avanzado3_5 {
    //Metodo factorial(), que calculará el factorial del número que se le pasa como parametro. Retornará el resultado del cálculo del factorial, o bien un -1 en caso de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro pasado sea cero.
    public static void main(String[] args) {
        int factorial5 = factorial(5);
        System.out.println("el factorial de 5 es " + factorial5);
    }

    static int factorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
