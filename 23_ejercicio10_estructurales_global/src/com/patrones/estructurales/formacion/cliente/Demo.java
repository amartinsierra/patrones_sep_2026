package com.patrones.estructurales.formacion.cliente;

import com.patrones.estructurales.formacion.composite.Categoria;
import com.patrones.estructurales.formacion.composite.Curso;
import com.patrones.estructurales.formacion.composite.ElementoFormacion;
import com.patrones.estructurales.formacion.decorador.CertificadoDecorador;
import com.patrones.estructurales.formacion.decorador.TutoriaDecorador;
import com.patrones.estructurales.formacion.service.FormacionService;

public class Demo {
	public static void main(String[] args) {
		FormacionService formacionService=new FormacionService();
        // Creamos cursos simples
		ElementoFormacion javaBasico = formacionService.crearCurso("Java Básico", 200);
        ElementoFormacion springBoot = formacionService.crearCurso("Spring Boot Avanzado",80);
        ElementoFormacion iaIntro = formacionService.crearCurso("Introducción a la IA", 250);
        ElementoFormacion cursoConExtras = formacionService.crearCursoCertificado("Spring", 100);
        // Creamos subcategorias categorías
        Categoria programacion = formacionService.crearCategoria("Programación",cursoConExtras,springBoot);
       

        Categoria inteligenciaArtificial = formacionService.crearCategoria("Inteligencia Artificial",iaIntro);
       
        //categoria principal
        Categoria formacion = formacionService.crearCategoria("Formación Online",programacion,inteligenciaArtificial);
        
        

        // Mostrar estructura completa
        System.out.println("=== Catálogo de formación ===");
        formacion.mostrar();
        System.out.println("Precio total formación: " + formacion.getPrecio() + "€");

        // Mostrar curso decorado
        System.out.println("\n=== Curso decorado ===");
        cursoConExtras.mostrar();
        System.out.println("Precio final curso decorado: " + cursoConExtras.getPrecio() + "€");
    }

}
