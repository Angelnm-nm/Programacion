package TiendaVideoJuegos2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainVideojuego {

    private List<VideoJuego> inventario = new ArrayList<>();
    private List<Clientes> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    public void enseñarVideoJuego(VideoJuego videoJuego) {
        inventario.add(videoJuego);
    }

    public VideoJuego buscarPorTitulo(String titulo){
        for(VideoJuego v : inventario){
            if(v.getTitulo().equalsIgnoreCase(titulo)){
                return v;
            }
        }
        return null;
    }
    public VideoJuego buscarPorId(UUID uuid){
        for(VideoJuego v : inventario){
            if (v.getIdentificador().equals(uuid)){
                return v;
            }
        }
        return null;
    }
    public Clientes buscarClientePorCodigo(int codigo){
        for(Clientes c : clientes){
            if(c.getCdCliente() == codigo){
                return c;
            }
        }
        return null;
    }
    public void registrarVenta(int codigoCliente, UUID idJuego){

        VideoJuego juego = buscarPorId(idJuego);

        if(juego != null && juego.getStock() > 0){
            juego.reducirStock(1);
            ventas.add(new Venta(codigoCliente, idJuego));
        }
    }
    public void mostrarVentas(){
        for(Venta v : ventas){
            System.out.println(v);
        }
    }
    public void mostrarVentasPorFecha(LocalDate fecha){
        for(Venta v : ventas){
            if(v.getFechaVenta().equals(fecha)){
                System.out.println(v);
            }
        }
    }
}