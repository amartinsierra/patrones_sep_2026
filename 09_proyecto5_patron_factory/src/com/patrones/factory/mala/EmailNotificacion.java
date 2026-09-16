package com.patrones.factory.mala;

public class EmailNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}
