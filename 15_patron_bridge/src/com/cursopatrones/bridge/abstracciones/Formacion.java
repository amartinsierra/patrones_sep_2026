package com.cursopatrones.bridge.abstracciones;

import com.cursopatrones.bridge.implementaciones.Modalidad;

public abstract class Formacion {
    protected Modalidad modalidad;
    public Formacion(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
    public abstract void formar();
}
