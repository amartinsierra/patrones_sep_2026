package com.patrones.proyecto.buena.notificaciones;

import com.patrones.proyecto.buena.canales.CanalNotificacion;

public class NotificacionRecordatorio extends Notificacion {
    public NotificacionRecordatorio(CanalNotificacion canal) {
        super(canal);
    }

    @Override
    public void enviarMensaje(String contenido) {
        canal.enviar("Recordatorio de compra: " + contenido);
    }
}

