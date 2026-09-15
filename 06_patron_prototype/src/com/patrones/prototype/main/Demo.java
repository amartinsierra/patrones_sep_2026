package com.patrones.prototype.main;

import java.util.ArrayList;
import java.util.List;

import com.patrones.prototype.model.Libro;

public class Demo {

	public static void main(String[] args) {
		var list=new ArrayList<String>(List.of("Autor1", "Autor2"));
		var l1=new Libro("El Quijote", "A888828266", list);
		var l2=l1.clone();
		
		l2.setTitulo("El Quijote II");
		l2.getAutores().add("Autor3");
		l2.getAutores().set(0, "nuevo autor");
		System.out.println(l1);
		System.out.println(l2);

	}

}
