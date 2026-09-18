package com.patrones.mediador.mediador;

import com.patrones.mediador.usuarios.Usuario;

public interface ChatMediador {
    void enviarMensaje(String mensaje, Usuario emisor);
    void registrarUsuario(Usuario usuario);
}
