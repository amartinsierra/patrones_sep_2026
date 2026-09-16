package com.patrones.factory.factoria;

import com.patrones.factory.dao.ProductosDao;
import com.patrones.factory.dao.ProductosDaoJdbc;

public class JdbcProductosDaoFactory implements ProductosDaoFactory {

	@Override
	public ProductosDao crear() {
		// operaciones complejas
		return new ProductosDaoJdbc();
	}

}
