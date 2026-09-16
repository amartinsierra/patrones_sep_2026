package com.patrones.factory.mala;

public class PushNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando PUSH: " + mensaje);
    }
}

