package com.patrones.solid.tienda.buena.service;

import java.util.ArrayList;
import java.util.List;

import com.patrones.solid.tienda.buena.media.Producto;
import com.patrones.solid.tienda.buena.utilities.CalculadoraImpuestos;
//Responsablidad única y Open/Close
public class Carrito {
	private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarCarrito() {
        for (Producto p : productos) {
            System.out.println(p.getTitulo() + " - " + p.getPrecio() + "€");
        }
    }

    public double calcularTotal(CalculadoraImpuestos calc) {
        double total = 0;
        for (Producto p : productos) {
            total += calc.calcularPrecioConImpuestos(p);
        }
        return total;
    }

}
