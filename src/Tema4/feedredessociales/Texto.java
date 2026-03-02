package Tema4.feedredessociales;

import java.util.Random;

public class Texto implements  Publicacion{
    String contenido;
    public Texto(String contenido) {
        this.contenido = contenido;
    }


    @Override
    public void mostrar() {
        System.out.println("\" " + contenido + "\"");

    }

    @Override
    public int verLikes() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
