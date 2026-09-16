package com.patrones.factory.buena.service;

import com.patrones.factory.buena.notificacion.Notificacion;

public class NotificacionService {
    private final Notificacion notificacion;
    public NotificacionService(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    public void procesar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}

