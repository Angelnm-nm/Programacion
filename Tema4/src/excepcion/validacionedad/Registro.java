package excepcion.validacionedad;

public class Registro {
    int edad;
    public void registrarEdad (int edad){
        if (edad<0||edad>120){
            throw  new Exception("error");
        }
        this.edad=edad;

    }
}
