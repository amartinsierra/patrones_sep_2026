package com.patrones.creacionales.factory;

import com.patrones.creacionales.model.Operador;
import com.patrones.creacionales.model.Usuario;

public class OperadorFactory implements Factory {

	public Usuario create(String name, String email) {
        return new Operador.Builder()
                .setNombre(name)
                .setEmail(email)
                .build();
    }


}
