package com.patrones.creacionales.factory;

import com.patrones.creacionales.model.Admin;
import com.patrones.creacionales.model.Usuario;

public class AdminFactory implements Factory {
    @Override
    public Usuario create(String name, String email) {
        Admin admin= new Admin.Builder()
                .setNombre(name)
                .setEmail(email)
                .build();
        admin.convocarSubordinados();
        admin.enviarAvisos();
        return admin;
    }

}
