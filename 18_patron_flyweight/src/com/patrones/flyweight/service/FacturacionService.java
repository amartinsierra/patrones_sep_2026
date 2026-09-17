package com.patrones.flyweight.service;

import com.patrones.flyweight.factoria.UsoIVAFactory;
import com.patrones.flyweight.interfaz.UsoIVA;

public class FacturacionService {
    private final UsoIVAFactory usoIVAFactory;
    public FacturacionService(UsoIVAFactory usoIVAFactory) {
        this.usoIVAFactory = usoIVAFactory;
    }
    public double calcularTotal(String tipo, double base) {
        UsoIVA uso = usoIVAFactory.obtenerUso(tipo);
        return uso.aplicarIVA(base);
    }
}
