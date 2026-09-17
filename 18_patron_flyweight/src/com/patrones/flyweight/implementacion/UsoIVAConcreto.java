package com.patrones.flyweight.implementacion;

import com.patrones.flyweight.interfaz.UsoIVA;

public class UsoIVAConcreto implements UsoIVA {
    private final double porcentaje;
    public UsoIVAConcreto(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public double aplicarIVA(double baseImponible) {
        return baseImponible*((1-porcentaje)/100);
    }
}
