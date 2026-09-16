package com.patrones.creacionales.model;

public abstract class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return getTipoUsuario() + "{nombre='" + nombre + "', email='" + email + "'}";
    }

    public abstract String getTipoUsuario();
    


    
}

