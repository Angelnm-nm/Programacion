 package FechasBasico;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ej3 {
    static void main() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        ZonedDateTime espana = ZonedDateTime.now(ZoneId.of("Europa/Madrid"));
        ZonedDateTime japon = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime mexico = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));

        System.out.println("España: " + espana.format(formato));
        System.out.println("Japón: " + japon.format(formato));
        System.out.println("Mexico: " + mexico.format(formato));


    }
}
