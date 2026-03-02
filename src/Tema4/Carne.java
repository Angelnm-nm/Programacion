package Tema4;

public class Carne extends Plato {

    public enum Coccion {
        POCO_HECHO, AL_PUNTO, MUY_HECHO, CARBONIZADO
    }

    private final Coccion punto;

    public Carne(String nombre, double precio, Coccion punto) {
        super(nombre, precio);
        this.punto = punto;
    }

    @Override
    public String toString() {
        return super.toString() + " | Punto: " + punto;
    }
}