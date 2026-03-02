package Tema4.sistemaDeModificaciones;

public class EmailNotificador implements Notificador{
    String destinatario = "email";
    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Eviando email a " +  destinatario + "@gmail.com " + mensaje);

    }

}
