package com.patrones.creacionales.service;

import com.patrones.creacionales.factory.Factory;
import com.patrones.creacionales.factory.FactoryRegistry;
import com.patrones.creacionales.model.Usuario;
import com.patrones.creacionales.singleton.EnvioUsuarioSingleton;

public class UsuarioService {
	public void enviarUsuario(String tipo, String nombre, String email) {
        Factory factory = FactoryRegistry.getFactory(tipo);

        if (factory == null) {
            throw new IllegalArgumentException("Tipo no soportado");
        }

       Usuario usuario = factory.create(nombre, email);
       EnvioUsuarioSingleton.INSTANCE.enviarUsusario(usuario);
       
    }

}
