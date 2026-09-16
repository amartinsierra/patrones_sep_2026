package com.patrones.creacionales.factory;

import com.patrones.creacionales.model.Invitado;
import com.patrones.creacionales.model.Usuario;

public class InvitadoFactory implements Factory {

	public Usuario create(String name, String email) {
        return new Invitado.Builder()
                .setNombre(name)
                .setEmail(email)
                .build();
    }


}
