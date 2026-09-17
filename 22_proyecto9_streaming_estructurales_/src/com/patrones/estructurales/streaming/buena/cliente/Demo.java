package com.patrones.estructurales.streaming.buena.cliente;

import com.patrones.estructurales.streaming.buena.composite.ComponenteReproducible;
import com.patrones.estructurales.streaming.buena.composite.ListaReproduccion;
import com.patrones.estructurales.streaming.buena.fachada.StreamingFachada;

public class Demo {
	public static void main(String[] args) {
        StreamingFachada facade = new StreamingFachada();

        // Crear películas con recursos compartidos (Flyweight)
        ComponenteReproducible matrix = facade.crearPelicula("Matrix", "Español", "Inglés", true);
        ComponenteReproducible lotr = facade.crearPelicula("El Señor de los Anillos", "Español", "Inglés", false);
        ComponenteReproducible serie = facade.crearSerie("Perdidos", 2,"Español", "Inglés");

        // Crear lista de reproducción (Composite)
        ListaReproduccion lista = facade.crearLista("Favoritas", matrix, lotr,serie);

        // Reproducir lista completa
        lista.reproducir();
    }


}
