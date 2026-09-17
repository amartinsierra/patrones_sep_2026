package com.cursopatrones.command.repository;

import com.cursopatrones.command.model.Producto;

public class OrderRepository {
	public void save(Producto producto) {
		System.out.println("Salvando el producto en la BD");
	}
}
