package com.patrones.creacionales.singleton;

import com.patrones.creacionales.model.Usuario;

public enum EnvioUsuarioSingleton {
    INSTANCE;
    public void enviarUsusario(Usuario usuario) {
        System.out.println("Enviando usuario: " + usuario);
    }
}

