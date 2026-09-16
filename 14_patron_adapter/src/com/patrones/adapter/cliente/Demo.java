package com.patrones.adapter.cliente;

import com.patrones.adapter.factory.MensajeFactory;
import com.patrones.adapter.target.Mensaje;

public class Demo {

	public static void main(String[] args) {
		Mensaje mensaje=MensajeFactory.crear();
		mensaje.send("mensaje de prueba");

	}

}
