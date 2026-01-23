import java.util.Scanner;

public class Avanzado_11 {    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numeroSecreto = (int) (Math.random() * 100) + 1;

    int intento;
    int contador = 0;

    System.out.println("Adivina el número entre 1 y 100");

    do {
        System.out.print("Introduce tu número: ");
        intento = sc.nextInt();
        contador++;

        if (intento < numeroSecreto) {
            System.out.println("El número es mayor");
        } else if (intento > numeroSecreto) {
            System.out.println("El número es menor ");
        } else {
            System.out.println("Has adivinado el número en " + contador + " intentos.");
        }

    } while (intento != numeroSecreto);

    sc.close();
}
}
