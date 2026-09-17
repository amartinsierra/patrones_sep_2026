package com.patrones.estructurales.streaming.buena.fachada;

import com.patrones.estructurales.streaming.buena.composite.ComponenteReproducible;
import com.patrones.estructurales.streaming.buena.composite.ListaReproduccion;
import com.patrones.estructurales.streaming.buena.composite.Pelicula;
import com.patrones.estructurales.streaming.buena.composite.Serie;
import com.patrones.estructurales.streaming.buena.flyweight.Factory;
import com.patrones.estructurales.streaming.buena.flyweight.Recurso;

public class StreamingFachada {
    public ComponenteReproducible crearPelicula(String titulo, String subt, String aud, boolean premium) {
        Recurso subtitulos = Factory.getRecurso(subt);
        Recurso audio = Factory.getRecurso(aud);
        Pelicula pelicula = new Pelicula(titulo, subtitulos, audio);
        
        return pelicula;
        //***opción por si queremos utilizar proxy
       //return new ProxyPelicula(pelicula, premium);
    }
    public ComponenteReproducible crearSerie(String titulo, int temporada, String subt, String aud) {
        Recurso subtitulos = Factory.getRecurso(subt);
        Recurso audio = Factory.getRecurso(aud);
        if(temporada<1) {
        	throw new RuntimeException("temporada no válida");
        }
        return new Serie(titulo, subtitulos, audio,temporada);
    }

    public ListaReproduccion crearLista(String nombre, ComponenteReproducible... elementos) {
        ListaReproduccion lista = new ListaReproduccion(nombre);
        for (ComponenteReproducible e : elementos) {
            lista.agregar(e);
        }
        return lista;
    }
}
