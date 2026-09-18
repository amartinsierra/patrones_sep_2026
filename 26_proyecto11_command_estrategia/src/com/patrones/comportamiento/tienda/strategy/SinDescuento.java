package com.patrones.comportamiento.tienda.strategy;

public class SinDescuento implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precioBase) {
        return precioBase;
    }
}
