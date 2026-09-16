package com.patrones.builderr.client;

import com.patrones.builderr.model.Conector;

public class Demo {

	public static void main(String[] args) {
		var conector=new Conector.ConectorBuilder()
				.dir("demo.es")
				.tipo(4)
				.build();
		

	}

}
