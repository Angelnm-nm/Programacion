package Robot;

import java.util.Random;

public class Robot {
    private final String nombre;
    private final String modelo;
    private double vida;
    private final double potenciaAtaque;
    private final double blindaje;

    public Robot(String nombre, String modelo) {
        Random r = new Random();

        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100;
        this.potenciaAtaque = r.nextInt(10, 21);
        this.blindaje = r.nextInt(0, 11);
    }

    public void mostrarEstadisticas() {
        System.out.println(
                nombre + " " + modelo +
                        " Vida " + vida +
                        " Ataque " + potenciaAtaque +
                        " Blindaje " + blindaje
        );
    }

    public void recibirDano(double cantidad) {
        double danoReal = cantidad - blindaje;
        if (danoReal > 0) {
            vida -= danoReal;
            if (vida < 0) {
                vida = 0;
            }
        }
    }
    public void atacar(Robot enemigo) {
        if (!this.estaVivo()) {
            System.out.println("El robot " + nombre + " está destruido y no puede atacar");
        } else if (!enemigo.estaVivo()) {
            System.out.println("El enemigo ya está vencido");
        } else {
            enemigo.recibirDano(potenciaAtaque);
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public double getVida() {
        return vida;
    }
}