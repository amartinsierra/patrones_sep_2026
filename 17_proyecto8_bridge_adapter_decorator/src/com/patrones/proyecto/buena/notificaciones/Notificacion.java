package com.patrones.proyecto.buena.notificaciones;

import com.patrones.proyecto.buena.canales.CanalNotificacion;

public abstract class Notificacion {
    protected CanalNotificacion canal;

    public Notificacion(CanalNotificacion canal) {
        this.canal = canal;
    }

    public abstract void enviarMensaje(String contenido);
}

