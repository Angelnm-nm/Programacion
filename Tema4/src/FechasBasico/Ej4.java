package FechasBasico;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ej4 {
    static void main(String[] args) {
        LocalDate fecha = LocalDate.now();

        if (fecha.getDayOfWeek()== DayOfWeek.SATURDAY||
        fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Es finde semana");

        }else {
            System.out.println(" NO es finde semana");
        }
    }
}
