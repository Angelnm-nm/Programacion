package Tema4.feedredessociales;

import java.util.Random;

public class Foto implements Publicacion {
    String resolucion (){
        return("1080 * 1080");
    }



    @Override
    public void mostrar() {
        System.out.println("Mostrando foto en" + "[" + resolucion() + "]");

    }
    @Override
    public int verLikes() {
    Random random = new Random();
        return random.nextInt(101);
    }
}
