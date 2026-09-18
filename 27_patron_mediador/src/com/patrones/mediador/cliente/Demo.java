package com.patrones.mediador.cliente;

import com.patrones.mediador.mediador.ChatConcreto;
import com.patrones.mediador.mediador.ChatMediador;
import com.patrones.mediador.usuarios.Usuario;
import com.patrones.mediador.usuarios.UsuarioConcreto;

public class Demo {

	public static void main(String[] args) {
		ChatMediador chat = new ChatConcreto();
        Usuario u1 = new UsuarioConcreto(chat, "Ana");
        Usuario u2 = new UsuarioConcreto(chat, "Luis");
        Usuario u3 = new UsuarioConcreto(chat, "Carlos");
        chat.registrarUsuario(u1);
        chat.registrarUsuario(u2);
        chat.registrarUsuario(u3);

        u1.enviar("Hola a todos");

	}

}
