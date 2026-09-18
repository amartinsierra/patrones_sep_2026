package com.patrones.mediador.usuarios;

import com.patrones.mediador.mediador.ChatMediador;

public abstract class Usuario {
    protected ChatMediador mediador;
    protected String nombre;

    public Usuario(ChatMediador mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}

