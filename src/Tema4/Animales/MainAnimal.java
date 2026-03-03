package Tema4.Animales;

public class MainAnimal {
    static void main() {
        Gato gato = new Gato("eugato");
        Perro perro = new Perro("pepe");

        Animal[] animals = new  Animal[4];

        animals[0] = gato;
        animals [1] = perro;

        animals[2] = new Gato("pedro");
        animals[3] = new Perro("españa");

        for (int i = 0; i < animals.length ; i++) {

            if (animals[i] instanceof Gato ){
                animals[i].respirar();
                ((Gato) animals[i]).maullar();
            }else{
                animals[i].respirar();
            }




        }
    }

}
