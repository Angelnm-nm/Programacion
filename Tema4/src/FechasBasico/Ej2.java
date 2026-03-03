package FechasBasico;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu dia de nacimiento");
        int dia = sc.nextInt();

        System.out.println("introduce tu mes de nacimiento");
        int mes = sc.nextInt();

        sc.close();

        LocalDate cumple = LocalDate.of(LocalDate.now().getYear(),mes,dia);
        LocalDate hoy = LocalDate.now();

        System.out.println(Period.between(cumple , hoy));



    }
}
