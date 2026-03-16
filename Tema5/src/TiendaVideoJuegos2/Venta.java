package TiendaVideoJuegos2;

import java.time.LocalDate;
import java.util.UUID;

public class Venta {
    String referenciaCliente;
    UUID ReferenciaArticulos;
    LocalDate fechaVenta;

    public Venta(String referenciaCliente, UUID referenciaArticulos, LocalDate fechaVenta) {
        this.referenciaCliente = referenciaCliente;
        ReferenciaArticulos = referenciaArticulos;
        this.fechaVenta = fechaVenta;
    }

    public Venta(int codigoCliente, UUID idJuego) {
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        this.referenciaCliente = referenciaCliente;
    }

    public UUID getReferenciaArticulos() {
        return ReferenciaArticulos;
    }

    public void setReferenciaArticulos(UUID referenciaArticulos) {
        ReferenciaArticulos = referenciaArticulos;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    @Override
    public String toString() {
        return "Venta{" +
                "referenciaCliente='" + referenciaCliente + '\'' +
                ", ReferenciaArticulos=" + ReferenciaArticulos +
                ", fechaVenta=" + fechaVenta +
                '}';
    }
}