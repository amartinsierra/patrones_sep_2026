package com.patrones.factory.service;

import java.util.List;

import com.patrones.factory.dao.ProductosDao;
import com.patrones.factory.model.Producto;

public class ProductosService {
	private ProductosDao productosDao;

	public ProductosService(ProductosDao productosDao) {
		this.productosDao = productosDao;
	}
	
	public List<Producto> obtenerProductos(){
		return productosDao.findAll();
	}
}
