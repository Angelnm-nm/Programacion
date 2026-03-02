package Persona;

import java.util.Random;

public class persona {
    public static final int BAJO_PESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;

    private static final char SEXO_DEFECTO = 'H';

    private String nombre;
    private int edad;
    private final String dni;
    private char sexo;
    private double peso;
    private double altura;


    public persona(String nombre) {
        this.nombre = nombre;
        this.sexo = SEXO_DEFECTO;
        this.dni = generaDNI();
    }

    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generaDNI();
    }


    public persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return BAJO_PESO;
        } else if (imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }


    public boolean esMayorDeEdad() {
        return edad >= 18;
    }


    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }
        return SEXO_DEFECTO;
    }


    private String generaDNI() {
        Random rand = new Random();
        int numero = rand.nextInt(90000000) + 10000000; // 8 cifras

        char[] letras = {
                'T','R','W','A','G','M','Y','F','P','D','X','B',
                'N','J','Z','S','Q','V','H','L','C','K','E'
        };

        char letra = letras[numero % 23];
        return numero + "" + letra;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDni() { return dni; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = comprobarSexo(sexo); }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}