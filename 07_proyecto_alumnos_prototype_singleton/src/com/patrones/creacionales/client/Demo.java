package com.patrones.creacionales.client;

import com.patrones.creacionales.prototype.Student;
import com.patrones.creacionales.singleton.GestorStudent;

public class Demo {

	public static void main(String[] args) {
		GestorStudent gestorStudent=GestorStudent.getInstance();
		Student s1=gestorStudent.getClone();
		s1.setName("clon 1");
		Student s2=gestorStudent.getClone();
		s2.getCourse().setNivel(2);
		s1.showInfo();
		s2.showInfo();
	}

}
