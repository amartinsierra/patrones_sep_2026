package com.patrones.factory.factoria;

import java.util.HashMap;
import java.util.Map;

public class FactoryRegistry {
	private static final Map<String, ProductosDaoFactory> factories = new HashMap<>();
    static {
    	//registramos las factorias JDBC y JPA
		factories.put("jdbc", new JdbcProductosDaoFactory());
		factories.put("jpa", new JpaProductosDaoFactory());
    }

    public static void registerFactory(String key, ProductosDaoFactory factory) {
        factories.put(key, factory);
    }

    public static ProductosDaoFactory getFactory(String key) {
        ProductosDaoFactory factory = factories.get(key);
        if (factory == null) throw new IllegalArgumentException("Tipo no soportado: " + key);
        return factory;
    }
}
