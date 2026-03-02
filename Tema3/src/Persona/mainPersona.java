package Persona;

import java.util.Scanner;

public class mainPersona {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Sexo (H/M): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();


        persona p1 = new persona(nombre, edad, sexo, peso, altura);
        persona p2 = new persona(nombre, edad, sexo);
        persona p3 = new persona(nombre);


        mostrarResultado(p1);
        mostrarResultado(p2);
        mostrarResultado(p3);
    }

    public static void mostrarResultado(persona p) {

        switch (p.calcularIMC()) {
            case persona.BAJO_PESO:
                System.out.println("Está por debajo de su peso ideal");
                break;
            case persona.PESO_IDEAL:
                System.out.println("Está en su peso ideal");
                break;
            case persona.SOBREPESO:
                System.out.println("Tiene sobrepeso");
                break;
        }

        if (p.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.println(p);
        System.out.println("-----------------------");
    }
}
