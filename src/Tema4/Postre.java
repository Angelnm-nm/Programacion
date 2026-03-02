package Tema4;

public class Postre extends Plato {
    private final boolean sinAzucar;

    public Postre(String nombre, double precio, boolean sinAzucar) {
        super(nombre, precio);
        this.sinAzucar = sinAzucar;
    }

    public boolean isSinAzucar() {
        return sinAzucar;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + (sinAzucar ? "Sin azucar" : "Con azucar");
    }
}