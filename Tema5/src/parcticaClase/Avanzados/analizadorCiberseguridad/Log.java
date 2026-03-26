package parcticaClase.Avanzados.analizadorCiberseguridad;

import java.util.Objects;

public class Log {

    int idLog;
    String ipOrigen;
    String ubicacion;

    public Log(int idLog, String ipOrigen, String ubicacion) {
        this.idLog = idLog;
        this.ipOrigen = ipOrigen;
        this.ubicacion = ubicacion;
    }

    // TODO el equals y el hashcode solo funcionaran con el id

    // TODO
    @Override
    public boolean equals(Object o) {
        //        return false;
        if (!(o instanceof Log log))
            return false;
        return this.idLog == log.idLog;
    }

    // TODO
    @Override
    public int hashCode() {
//        return 0;
        return Objects.hash(idLog);
    }

}
