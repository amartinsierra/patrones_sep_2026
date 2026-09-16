package com.cursopatrones.bridge.client;

import com.cursopatrones.bridge.abstracciones.Curso;
import com.cursopatrones.bridge.abstracciones.Formacion;
import com.cursopatrones.bridge.abstracciones.Master;
import com.cursopatrones.bridge.implementaciones.ModalidadOnline;
import com.cursopatrones.bridge.implementaciones.ModalidadPresencial;

public class Demo {

	public static void main(String[] args) {
		Formacion cursoOnline = new Curso(new ModalidadOnline());
        Formacion masterPresencial = new Master(new ModalidadPresencial());

        cursoOnline.formar();// Curso se imparte completamente online.
        masterPresencial.formar(); // Máster se imparte de forma presencial
                                     // en el aula.


	}

}
