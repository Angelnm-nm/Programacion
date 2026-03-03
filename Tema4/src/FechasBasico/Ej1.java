package FechasBasico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ej1 {
    static void main() {
        LocalDate fecha = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("'hoy es' EEEE, dd 'de' yyyy");
        System.out.println(formato.format(fecha));



    }
}