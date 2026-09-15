package com.patrones.solid.tienda.buena.cliente;

import com.patrones.solid.tienda.buena.media.Cancion;
import com.patrones.solid.tienda.buena.media.Demo;
import com.patrones.solid.tienda.buena.media.Videojuego;
import com.patrones.solid.tienda.buena.service.Carrito;
import com.patrones.solid.tienda.buena.utilities.CalculadoraImpuestos;

public class Main {

	public static void main(String[] args) {
		var carrito=new Carrito();
		carrito.agregarProducto(new Cancion("c1",5,4));
		carrito.agregarProducto(new Cancion("c2",10,3));
		carrito.agregarProducto(new Videojuego("v1",30,740));
		carrito.mostrarCarrito();
		System.out.println("Total: "+carrito.calcularTotal(new CalculadoraImpuestos(21)));
		

	}
	
	void reproducirDemos(Demo demo) {
		demo.reproducirDemo();
	}

}
