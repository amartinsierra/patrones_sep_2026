package com.patrones.factory.buena.factory;

import com.patrones.factory.buena.notificacion.Notificacion;
import com.patrones.factory.buena.notificacion.SmsNotificacion;

public class SmsNotificacionFactory implements NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new SmsNotificacion();
    }
}

