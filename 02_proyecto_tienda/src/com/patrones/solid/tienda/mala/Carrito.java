package com.patrones.solid.tienda.mala;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ProductoDigital> productos = new ArrayList<>();

    public void agregarProducto(ProductoDigital p) {
        productos.add(p);
    }

    public void mostrarCarrito() {
        for (ProductoDigital p : productos) {
            System.out.println(p.getTitulo() + " - " + p.getPrecio() + "€");
        }
    }

    // Calcular total (incluye impuestos del 21%)
    public double calcularTotal() {
        double total = 0;
        for (ProductoDigital p : productos) {
            total += p.getPrecio() * 1.21;
        }
        return total;
    }
}

