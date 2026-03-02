package Tema4.Excepcionesej1;

public class ValidarNumero {
    public void numeroPositivo(int numero) {
        if (numero < 0)
            throw new IllegalArgumentException();
        System.out.println("Numero Positivo: " + numero);
    }
}