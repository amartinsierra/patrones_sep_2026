package com.cursopatrones.strategy.client;

import com.cursopatrones.strategy.service.UsuarioService;

public class Demo {

	public static void main(String[] args) {
		var service=new UsuarioService();
		System.out.println(service.buscar("nombre", "Ana"));
		System.out.println(service.buscar("departamento", "USER"));

	}

}
