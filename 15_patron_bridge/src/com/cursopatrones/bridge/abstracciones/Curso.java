package com.cursopatrones.bridge.abstracciones;

import com.cursopatrones.bridge.implementaciones.Modalidad;

public class Curso extends Formacion {   
    public Curso(Modalidad modalidad) {
        super(modalidad);
    }
    @Override
    public void formar() {
        modalidad.impartir("Curso");
    }
}

