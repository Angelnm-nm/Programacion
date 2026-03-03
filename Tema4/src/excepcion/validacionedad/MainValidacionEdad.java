package excepcion.validacionedad;

public class MainValidacionEdad {
    static void main(String[] args) {
        Registro registro = new Registro();
        try {
            registro.registrarEdad(-10);
        }catch (Exception e){
            System.out.println("error esta edad no es posible ");
        }
    }
}
