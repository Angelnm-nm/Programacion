public class ArraysRepaso2 {
    public static void main(String[] args) {
        int[] notas = {4, 9, 7, 5, 10};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(" " + i + " ");

        }
        int contador = 0;
        for (int nota : notas) {
            if (nota <= 5) ;
            {
                contador++;
            }
        }
    }
}
