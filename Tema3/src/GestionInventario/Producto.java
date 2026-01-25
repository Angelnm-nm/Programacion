package GestionInventario;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int vender(int cantidad) {
        if (stock == 1) {

        }
        return cantidad - stock;

    }

    int reponer(int cantidad) {
        return stock;


    }
    public String mostrarInfo() {
        System.out.printf("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
        return " ";
    }
}
