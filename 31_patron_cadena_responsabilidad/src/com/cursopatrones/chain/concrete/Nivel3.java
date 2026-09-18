package com.cursopatrones.chain.concrete;

import com.cursopatrones.chain.handler.Soporte;

public class Nivel3 extends Soporte {
    @Override
    public void manejarTicket(String tipoProblema) {
        if(tipoProblema.equalsIgnoreCase("avanzado")) {
            System.out.println("Nivel 3: Resolviendo problema avanzado.");
        } else if(siguiente != null) {
            siguiente.manejarTicket(tipoProblema);
        } else {
            System.out.println("Nadie puede resolver este problema.");
        }
    }
}

