package Tema4.excepcionesej2;

import java.io.IOException;
import java.util.Scanner ;

public class ProcesadorDatos {
    Scanner leer = new Scanner(System.in);
    public void procesarEtrada() throws IOException {
        try {
            System.out.println("Ingresa el valor del numero");
            int numero = Integer.parseInt(leer.nextLine());
            int resultado = numero / 100;

        }catch(NumberFormatException e) {
            System.out.println("Error en el numero");

        } catch (ArithmeticException e) {
            System.out.println("Error no se puede dividir por cero");
        }
        finally {
            System.out.println("Fin");
        }
    }
}
