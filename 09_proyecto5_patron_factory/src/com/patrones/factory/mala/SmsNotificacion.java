package com.patrones.factory.mala;

public class SmsNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
