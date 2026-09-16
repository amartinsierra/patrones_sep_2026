package com.patrones.decordor.decoradores;

import com.patrones.decordor.interfaz.Ordenador;

public abstract class DecoradorBase implements Ordenador {
    private Ordenador componente;
    public DecoradorBase(Ordenador componente) {
        super();
        this.componente = componente;
    }
    protected Ordenador getComponente(){return componente;}
    @Override
    public String getDescripcion() {
        return componente.getDescripcion();
    }
    @Override
    public double getPrecio() {
        return componente.getPrecio();
    }
}
