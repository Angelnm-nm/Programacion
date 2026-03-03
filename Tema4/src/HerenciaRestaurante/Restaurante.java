package HerenciaRestaurante;

public class Restaurante {

    public class Plato {
        String nombre;
        double precio;

        public Plato(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + " precio: "+ precio;
        }
    }

}