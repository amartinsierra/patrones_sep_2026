package com.patrones.estructurales.formacion.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements ElementoFormacion {
    private final String nombre;
    private final List<ElementoFormacion> elementos = new ArrayList<>();
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    
}

