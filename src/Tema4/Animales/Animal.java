package Tema4.Animales;

public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }
    public void respirar (){
        System.out.println(nombre + " respirando");
    }

    @Override
    public String toString() {
        return nombre + " nombre" + edad + " edad";
    }
}
