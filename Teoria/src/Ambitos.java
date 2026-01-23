public class Ambitos {
    public static void main(String[] args) {
        int edad = 79;
        if(edad>65){
            System.out.println("Enhorabuena estas jubilado");
            float pension = calculameLapension(edad);
            System.out.println("Su pension es" + pension);
        }
    }
    static float calculameLapension(int edad) {
        return edad * 34;
    }
}