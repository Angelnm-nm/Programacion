package EjerciciosBasicos;

public class EjerciciosBasicos_2 {
    public static void main(String[] args) {

        int a = 500;
        int b= 200;
        int c= 20;

        if (a > b && a > c) {
            System.out.println(b);
        }else if (b > a && c > b){
            System.out.println(c);
        }
    }
}