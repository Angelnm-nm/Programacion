package VideoJuego;

public class Personaje {
    String nombre;
    int nivel;
    int puntoDeVida;
    boolean esMagico;

    public Personaje(String nombre, int nivel, int puntoDeVida, boolean esMagico) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntoDeVida = 100;
        this.esMagico = esMagico;
    }

    int recibirDaño(int daño) {
        if (this.esMagico) {
            return daño / 3;
        }
        return daño;
    }

    int curar() {
        if (nivel < 5) {
            return puntoDeVida + 10;
        }
        if (nivel <= 5) {
            return puntoDeVida + 25;
        }

        Math.min(puntoDeVida, 100);
        return curar();

    }
    String mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        return " ";
    }
}
