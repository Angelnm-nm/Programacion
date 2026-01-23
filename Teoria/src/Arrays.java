import java.util.Arrays;

class PruebasArrays {
    public static void main(String[] args) {
        int notaPrimerExamen = 7;
        int notasegundoExamen = 6;

        int[] notasExamenesAngel = new int[3];

        notasExamenesAngel[0] = 3;
        notasExamenesAngel [1] = 5;
        notasExamenesAngel[2] = 5;

        System.out.println(Arrays.toString(notasExamenesAngel));
        int[] notasAngelAuxiliares = notasExamenesAngel;
        notasExamenesAngel = new int[4];
        for (int i = 0; i < notasAngelAuxiliares.length ; i++) {
            notasExamenesAngel[i] = notasAngelAuxiliares [i];

        }
        notasExamenesAngel [3] = 6;
        System.out.println(Arrays.toString(notasExamenesAngel));
        System.out.println(Arrays.toString(notasAngelAuxiliares));

        int [] otra = notasExamenesAngel;
        otra [3] = 1;
        System.out.println(Arrays.toString(otra));
        System.out.println(Arrays.toString(notasExamenesAngel));
    }
}