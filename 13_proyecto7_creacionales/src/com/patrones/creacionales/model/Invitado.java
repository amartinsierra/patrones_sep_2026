package com.patrones.creacionales.model;

import com.patrones.creacionales.singleton.EnvioUsuarioSingleton;

public class Invitado extends Usuario {
	private Invitado(Builder builder) {
        super(builder.nombre, builder.email);
    }

    @Override
    public String getTipoUsuario() {
        return "Invitado";
    }

  

    public static class Builder {
        private String nombre;
        private String email;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Invitado build() {
            return new Invitado(this);
        }
    }

}
