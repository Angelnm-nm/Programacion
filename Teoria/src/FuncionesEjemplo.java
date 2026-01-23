import java.util.Scanner;

public class FuncionesEjemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base");

        int base = sc.nextInt();
        System.out.println("introduce la altura");

        int altura = sc.nextInt();
        double area = base * altura/2d;

        System.out.println("El area seria"+ area);

        sc.close();
    }
    static double calcularAreaTriangulo(int base,int altura){
        return base * altura / 2d;
    }
}