package com.patrones.factory.buena.notificacion;

public class SmsNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}

