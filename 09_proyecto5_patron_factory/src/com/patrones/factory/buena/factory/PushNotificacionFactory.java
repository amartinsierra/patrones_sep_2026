package com.patrones.factory.buena.factory;

import com.patrones.factory.buena.notificacion.Notificacion;
import com.patrones.factory.buena.notificacion.PushNotificacion;

public class PushNotificacionFactory implements NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new PushNotificacion();
    }
}

