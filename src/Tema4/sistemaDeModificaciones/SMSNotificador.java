package Tema4.sistemaDeModificaciones;

public class SMSNotificador implements Notificador {
    String destinatario = "numero de telefono";
    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Enviando mensaje a " +  destinatario + ": " + mensaje);
    }
}
