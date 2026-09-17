package com.patrones.estructurales.formacion.decorador;

import com.patrones.estructurales.formacion.composite.ElementoFormacion;

public abstract class CursoDecorador implements ElementoFormacion {
    protected final ElementoFormacion curso;

    public CursoDecorador(ElementoFormacion curso) {
        this.curso = curso;
    }

    @Override
    public void mostrar() {
        curso.mostrar();
    }

    @Override
    public double getPrecio() {
        return curso.getPrecio();
    }
    @Override
	public double getNombre() {
		return curso.getNombre();
	}
}

