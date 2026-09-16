package com.patrones.decordor.decorable;

import com.patrones.decordor.interfaz.Ordenador;

public final class OrdenadorBase implements Ordenador{
    @Override
    public String getDescripcion() {    
        return "Ordenador con configuración estandar";
    }
    @Override
    public double getPrecio() {
        return 500;
    }
}
