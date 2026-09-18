package service;

import composite.Componente;
import composite.Modulo;
import observer.AnalyticSystem;

public class CursosService {
	public Modulo crearModulo(String nombre, Componente ... components) {
		Modulo modulo=new Modulo(nombre);
		modulo.addObserver(new AnalyticSystem());
		for(Componente component:components) {
			modulo.add(component);
		}
		return modulo;
	}
}
