package GestionInventario;

public class mainProducto {
    static void main(String[] args) {
        Producto producro1 = new Producto("Tomates",5,1);
        System.out.println("Producto 1: " + producro1.vender(1));
        System.out.println("Producto 1: " + producro1.reponer(1));
        System.out.println("producto 1: " + producro1.mostrarInfo());

    }
}
