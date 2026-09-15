package com.patrones.solid.reproductor.buena.cliente;

import com.patrones.solid.reproductor.buena.streaming.Reproductor;

public class GestorReproductor {
	Reproductor reproductor;
	
	public GestorReproductor(Reproductor reproductor) {
		this.reproductor = reproductor;
	}

	void reproducir() {
		reproductor.reproducir();
	}
}
