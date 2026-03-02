package Tema4.Excepcionesej1;

import Tema4.feedredessociales.Foto;

public class Mainej1Excepciones extends Tema4.Excepcionesej1.ValidarNumero {
    static void main() {

        Tema4.Excepcionesej1.ValidarNumero validar = new Tema4.Excepcionesej1.ValidarNumero();
        int[] numeros = {1, 2, -3};
        for (int numero : numeros) {
            try {
                validar.numeroPositivo(numero);

            } catch (IllegalArgumentException e) {
                System.out.println("Error el numero " + numero + " es negativo");
            }
        }
    }
}

