package com.patrones.creacionales.model;

public class Operador extends Usuario {
	private final int categoria;
	private Operador(Builder builder) {
        super(builder.nombre, builder.email);
        this.categoria=builder.categoria;
    }

    @Override
    public String getTipoUsuario() {
        return "Operador";
    }

    

    public static class Builder {
        private String nombre;
        private String email;
        private int categoria;
        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setCategoria(int categoria) {
            this.categoria = categoria;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public Operador build() {
            return new Operador(this);
        }
    }

	//otros métodos específicos de la clase
	public void establecerProtocolo() {
		
	}
}

