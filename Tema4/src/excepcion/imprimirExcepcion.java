package excepcion;

import java.util.Scanner;

public class imprimirExcepcion {
    static void main() {


        Scanner sc = new Scanner(System.in);

            System.out.println("escribe un numero ");
            int numeroArriba = sc.nextInt();
            try {
                System.out.println("el numero es " + numeroArriba);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                sc.close();
            }
        }
    }
