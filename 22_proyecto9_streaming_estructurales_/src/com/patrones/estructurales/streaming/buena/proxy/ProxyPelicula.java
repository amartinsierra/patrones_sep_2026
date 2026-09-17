package com.patrones.estructurales.streaming.buena.proxy;

import com.patrones.estructurales.streaming.buena.composite.ComponenteReproducible;
import com.patrones.estructurales.streaming.buena.composite.Pelicula;

public class ProxyPelicula implements ComponenteReproducible {
    private Pelicula pelicula;
    private boolean premium;

    public ProxyPelicula(Pelicula pelicula, boolean premium) {
        this.pelicula = pelicula;
        this.premium = premium;
    }

    @Override
    public void reproducir() {
        if (!premium) {
            System.out.println("Acceso denegado: necesitas cuenta premium.");
        } else {
            pelicula.reproducir();
        }
    }
}

