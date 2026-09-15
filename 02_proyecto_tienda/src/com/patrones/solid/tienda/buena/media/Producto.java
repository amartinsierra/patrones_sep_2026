package com.patrones.solid.tienda.buena.media;

public abstract class Producto {
	private String titulo;
    private double precio;

    public Producto(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
}

