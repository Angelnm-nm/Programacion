package TiendaVideoJuegos2;
import java.util.UUID;
public class VideoJuego {
    String titulo;
    String plataforma;
    String genero;
    double precio;
    int stock;
    UUID Identificador;

    public VideoJuego(String titulo, String plataforma, String genero, double precio, int stock) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        Identificador = UUID.randomUUID();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public UUID getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(UUID identificador) {
        Identificador = identificador;
    }
    public void reducirStock(int cantidad){
        stock -= cantidad;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", Identificador=" + Identificador +
                '}';
    }
}
