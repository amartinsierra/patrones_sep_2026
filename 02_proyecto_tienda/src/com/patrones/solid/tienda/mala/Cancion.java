package com.patrones.solid.tienda.mala;

public class Cancion extends ProductoDigital {
    public Cancion(String titulo, double precio) {
        super(titulo, precio);
    }

    @Override
    public void reproducirDemo() {
        throw new UnsupportedOperationException("No se puede reproducir demo de canción");
    }
}

