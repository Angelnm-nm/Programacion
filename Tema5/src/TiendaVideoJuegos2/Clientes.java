package TiendaVideoJuegos2;

public class Clientes {
    String nombre;
    String apellidos;
    String direccion;
    String email;
    int cdCliente;

    public Clientes(String nombre, String apellidos, String direccion, String email, int cdCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.cdCliente = cdCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", cdCliente=" + cdCliente +
                '}';
    }
}
