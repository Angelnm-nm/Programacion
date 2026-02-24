package Tema4.rpg;

public class mainrpg {
     public  static  void realizarAccionHeroica(Atacante a){
         a.atacar();
     }

    static void main(String[] args) {
    Guerrero c = new Guerrero();
    Paladin g = new Paladin();

    realizarAccionHeroica(c);
    realizarAccionHeroica(g);


    }
}
