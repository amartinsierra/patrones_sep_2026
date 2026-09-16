package com.patrones.creacionales.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.patrones.creacionales.model.Usuario;

public class FactoryRegistry {

	static HashMap<String, Factory> factoryMap = new HashMap<>();
    static {
        factoryMap.put("admin", new AdminFactory());
        factoryMap.put("operador", new OperadorFactory());
        factoryMap.put("invitado", new InvitadoFactory());
    }

    public static void registerFactory(String tipo, Factory factory) {
        factoryMap.put(tipo.toLowerCase(), factory);
    }

    public static Factory getFactory(String tipo) {
        return factoryMap.get(tipo.toLowerCase());
    }

}
