package Tema4.feedredessociales;

import java.util.Random;

public class MainRedesSociales {
    static void main() {
        Publicacion[] publicacion = new Publicacion[4];
        publicacion[0] = new  Foto();
        publicacion[1] = new Texto("hola mundo.");
        publicacion[2] = new Foto();
        publicacion[3] = new Texto("holaaaaaa");

        for (Publicacion publicacion1 : publicacion) {
            publicacion1.mostrar();
            publicacion1.verLikes();
        }
    }
}


