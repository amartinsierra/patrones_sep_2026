package com.patrones.factory.client;

import com.patrones.factory.dao.ProductosDao;
import com.patrones.factory.factoria.FactoryRegistry;
import com.patrones.factory.service.ProductosService;

public class Demo {

	public static void main(String[] args) {
		String key="jdbc";
		ProductosDao productosDao=FactoryRegistry.getFactory(key).crear();
		var productosService=new ProductosService(productosDao);
		productosService.obtenerProductos();

	}

}
