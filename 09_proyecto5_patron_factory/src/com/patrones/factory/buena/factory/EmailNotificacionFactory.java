package com.patrones.factory.buena.factory;

import com.patrones.factory.buena.notificacion.EmailNotificacion;
import com.patrones.factory.buena.notificacion.Notificacion;

public class EmailNotificacionFactory implements NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new EmailNotificacion();
    }
}

