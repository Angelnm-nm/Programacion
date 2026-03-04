package Tema4.empresa_de_trasporte;

public class Vehiculo implements IntefazTransportable{
    String matricula;
    int kilometrosRecorridos;
    int combustibleRestante;

    public Vehiculo(int combustibleRestante, int kilometrosRecorridos, String matricula) {
        this.combustibleRestante = combustibleRestante;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.matricula = matricula;
    }








    @Override
    public void viajar(double distancia) throws SinCombustibleException {

    }
}
