package com.cursopatrones.chain.concrete;

import com.cursopatrones.chain.handler.Soporte;

public class Nivel2 extends Soporte {
    @Override
    public void manejarTicket(String tipoProblema) {
        if(tipoProblema.equalsIgnoreCase("intermedio")) {
            System.out.println("Nivel 2: Resolviendo problema intermedio.");
        } else if(siguiente != null) {
            siguiente.manejarTicket(tipoProblema);
        } else {
            System.out.println("Nadie puede resolver este problema.");
        }

    }
}

