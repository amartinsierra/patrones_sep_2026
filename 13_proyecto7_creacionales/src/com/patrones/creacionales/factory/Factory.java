package com.patrones.creacionales.factory;

import com.patrones.creacionales.model.Usuario;

public interface Factory {
	Usuario create(String name, String email);
}
