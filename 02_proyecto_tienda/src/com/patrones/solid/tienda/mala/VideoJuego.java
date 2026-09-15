package com.patrones.solid.tienda.mala;

public class VideoJuego extends ProductoDigital {
    public VideoJuego(String titulo, double precio) {
        super(titulo, precio);
    }

    @Override
    public void reproducirDemo() {
        System.out.println("Iniciando demo jugable de: " + titulo);
    }
}

