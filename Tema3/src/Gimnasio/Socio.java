package Gimnasio;

public class Socio {

    private static int contadorSocios = 0;

    private int id;
    private String nombre;

    public Socio(String nombre) {
        contadorSocios++;
        this.id = contadorSocios;
        this.nombre = nombre;
    }

    public static int getTotalSocios() {
        return contadorSocios;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}

