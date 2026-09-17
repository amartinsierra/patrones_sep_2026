package com.patrones.proyecto.buena.notificaciones;

import com.patrones.proyecto.buena.canales.CanalNotificacion;

public class NotificacionConfirmacion extends Notificacion {
    public NotificacionConfirmacion(CanalNotificacion canal) {
        super(canal);
    }

    @Override
    public void enviarMensaje(String contenido) {
        canal.enviar("Confirmación de compra: " + contenido);
    }
}

