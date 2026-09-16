package com.patrones.creacionales.singleton;

import com.patrones.creacionales.prototype.Curso;
import com.patrones.creacionales.prototype.Student;

public class GestorStudent {
	private static GestorStudent gestor;
	private Student student;
	private GestorStudent() {
		student=new Student("Alumno",new Curso("Curso patrones",4),"mañana");
	}
	public static GestorStudent getInstance() {
		if(gestor==null) {
			gestor=new GestorStudent();
		}
		return gestor;
	}
	
	public Student getClone() {
		return student.clone();
	}
	
}
