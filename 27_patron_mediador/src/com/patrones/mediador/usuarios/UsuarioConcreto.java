package com.patrones.mediador.usuarios;

import com.patrones.mediador.mediador.ChatMediador;

public class UsuarioConcreto extends Usuario {
    public UsuarioConcreto(ChatMediador mediador, String nombre) {
        super(mediador, nombre);
    }

    public void enviar(String mensaje) {
        System.out.println(this.nombre + " envía: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje) {
        System.out.println(this.nombre + " recibe: " + mensaje);
    }
}

