package com.patrones.mediador.mediador;

import java.util.ArrayList;
import java.util.List;

import com.patrones.mediador.usuarios.Usuario;

public class ChatConcreto implements ChatMediador {
    private List<Usuario> usuarios = new ArrayList<>();
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void enviarMensaje(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibir(mensaje);
            }
        }
    }
}
