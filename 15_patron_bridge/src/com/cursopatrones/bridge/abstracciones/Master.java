package com.cursopatrones.bridge.abstracciones;

import com.cursopatrones.bridge.implementaciones.Modalidad;

public class Master extends Formacion {
    public Master(Modalidad modalidad) {
        super(modalidad);
    }
    @Override
    public void formar() {
        modalidad.impartir("Máster");
    }
}
