package Robot;

public class mainRobot {
    static void main(String[] args) {

        Robot robot1 = new Robot("Mazinger", "Z");
        Robot robot2 = new Robot("Optimus", "Prime");

        System.out.println(" estadisticas iniciales");
        robot1.mostrarEstadisticas();
        robot2.mostrarEstadisticas();

        while (robot1.estaVivo() && robot2.estaVivo()) {

            robot1.atacar(robot2);

            if (robot2.estaVivo()) {
                robot2.atacar(robot1);
            }

            System.out.println("Vida Mazinger: " + robot1.getVida());
            System.out.println("Vida Optimus: " + robot2.getVida());
            System.out.println(" ");
        }

        System.out.println(" se acabo el torneo");

        if (robot1.estaVivo()) {
            System.out.println("Ha ganado Mazinger");
        } else {
            System.out.println("Ha ganado Optimus");
        }
    }
}