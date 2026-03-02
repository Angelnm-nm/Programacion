package PersonaEx;

public class Person {
    private final String nombre;
    private final int edad;
    private final boolean esFumador;
    private final String estadoSalud;
    private final double seguro = 500;

    public Person(String nombre, int edad, boolean esFumador, String estadoSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.esFumador = esFumador;
        this.estadoSalud = estadoSalud;
    }

    public double calcularImporteSeguro() {

        double seguro = 500; // base del seguro


        if (edad < 25) {
            seguro *= 1.20; // +20%
        } else if (edad > 40) {
            seguro *= 1.10; // +10%
        }

        if (esFumador) {
            seguro *= 1.30; // +30%
        }


        if (estadoSalud.equalsIgnoreCase("Bueno")) {
            seguro *= 1.10;
        } else if (estadoSalud.equalsIgnoreCase("Regular")) {
            seguro *= 1.20;
        } else if (estadoSalud.equalsIgnoreCase("Malo")) {
            seguro *= 1.40;
        }

        return seguro;
    }

}
