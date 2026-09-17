package com.patrones.estructurales.formacion.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements ElementoFormacion {
    private final String nombre;
    private final List<ElementoFormacion> elementos = new ArrayList<>();
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    public void agregar(ElementoFormacion componente) {
        elementos.add(componente);
    }
    public void eliminar(ElementoFormacion componente) {
        elementos.remove(componente);
    }
    @Override
    public void mostrar() {
        System.out.println("Categoría: " + nombre);
        for (ElementoFormacion comp : elementos) {
            comp.mostrar();
        }
    }
    @Override
    public double getPrecio() {
        return elementos.stream().mapToDouble(ElementoFormacion::getPrecio).sum();
    }
	@Override
	public String getNombre() {
		return nombre;
	}
    
}

