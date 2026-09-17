package com.patrones.estructurales.streaming.buena.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, Recurso> cache = new HashMap<>();

    public static Recurso getRecurso(String data) {
        return cache.computeIfAbsent(data, RecursoCompartido::new);
    }
}

