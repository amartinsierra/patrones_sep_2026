package com.patrones.creacionales.prototype;

public class Curso implements Cloneable{
	private String denominacion;
	private int nivel;
	
	public String getName() {
		return denominacion;
	}

	public void setName(String name) {
		this.denominacion = name;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Curso(String name, int nivel) {
		super();
		this.denominacion = name;
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Course [name=" + denominacion + ", Nivel=" + nivel + "]";
	}

	@Override
	protected Curso clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Curso)super.clone();
	}
	
}
