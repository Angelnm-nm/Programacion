package Tema4.empresa_de_trasporte;

public class Camion extends Vehiculo {
    double cargActual;
    double capacidadMaxima;
    public Camion(int combustibleRestante, int kilometrosRecorridos, String matricula, double cargActual, double capacidadMaxima) {
        super(combustibleRestante, kilometrosRecorridos, matricula);
        this.cargActual = cargActual;
        this.capacidadMaxima = 5000;
    }
    public double consumoCamion (){
        if (cargActual == 1000){
            return combustibleRestante * 0.101;
        }
        return combustibleRestante * 0.1;
    }

    }

