package Tema4.sistemaDeModificaciones;

public class MainSistemaModificaciones {
    static void main() {
        Notificador[] notificador = new Notificador[2];

        notificador[0] = new SMSNotificador();
        notificador[1] = new EmailNotificador();

        for (Notificador notificador1 : notificador) {
            notificador1.enviarMensaje("Hola","123569");
        }

    }

}

