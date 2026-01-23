package rectangulo;

public class rectangulo {
    private int ancho;
    private int largo;
    // contructor default
    public rectangulo() {
        ancho = 3;
        largo = 5;
    }

    public rectangulo (int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    public int area(){
        return ancho * largo;
    }
    public int perimetro(){
        return 2 * (ancho + largo);
    }
    public String HoV() {
        if (ancho<largo) {
            return "horizontal";
        }
        if (largo< ancho){
            return "ancho";
        }
        return " ";
    }
    public void mostrarDimensiones() {
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
    }
    public void dibujarRectangulo() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //getter and setter
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0){
            this.ancho = ancho;
        }
    }

    public int getLargo() {
        return largo;

    }

    public void setLargo(int largo) {
        if (largo > 0){
            this.largo = largo;
        }
    }
}

