package Tema4.empresa_de_trasporte;

public class SinCombustibleException extends Exception {
    public SinCombustibleException(int combustible) {
        if (combustible == 0) {
            System.out.println("cumbustible nulo");
        }
    }
}
