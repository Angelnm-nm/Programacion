import java.util.Scanner;

public class PruebasConElSi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu edad");
        int edad = sc.nextInt();
        if (edad >= 18) {
            if (edad>=64){
                System.out.println("esta jubilado");
            } else {
            System.out.println("eres mayor de edad y trabajas");
            }
            }else {
            System.out.println("eres menor de edad");

        }





        sc.close();
    }
}
