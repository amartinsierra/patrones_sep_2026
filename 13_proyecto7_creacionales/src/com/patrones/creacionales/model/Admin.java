package com.patrones.creacionales.model;

import com.patrones.creacionales.singleton.EnvioUsuarioSingleton;

public class Admin extends Usuario {
	private Admin(Builder builder) {
        super(builder.nombre, builder.email);
    }

    @Override
    public String getTipoUsuario() {
        return "Admin";
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

        public Admin build() {
            return new Admin(this);
        }
    }

	//otros métodos específicos de la clase
	public void enviarAvisos() {
		
	}
	public void convocarSubordinados() {
		
	}
}
