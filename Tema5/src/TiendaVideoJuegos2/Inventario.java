package TiendaVideoJuegos2;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<String> videoJuegos = new ArrayList<>();

    public Inventario(List<String> videoJuegos) {
        this.videoJuegos = videoJuegos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "videoJuegos=" + videoJuegos +
                '}';
    }
}
