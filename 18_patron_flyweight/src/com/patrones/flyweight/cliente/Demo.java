package com.patrones.flyweight.cliente;

import com.patrones.flyweight.factoria.UsoIVAFactory;
import com.patrones.flyweight.service.FacturacionService;

public class Demo {

	public static void main(String[] args) {
		var facturacionService=new FacturacionService(new UsoIVAFactory());
		
		System.out.println("Total con IVA reducido: " + facturacionService.calcularTotal("reducido", 100));
		System.out.println("Total con IVA superreducido: " + facturacionService.calcularTotal("superreducido", 300));
		System.out.println("Total con IVA reducido: " + facturacionService.calcularTotal("reducido", 50));

	}

}
