package com.patrones.factory.buena.cliente;

import com.patrones.factory.buena.factory.FactoryRegistry;
import com.patrones.factory.buena.service.NotificacionService;

public class Demo {
	public static void main(String[] args) {
        NotificacionService emailService = new NotificacionService(FactoryRegistry.getFactory("email").crearNotificacion());
        emailService.procesar("Hola desde Email Factory");

        NotificacionService smsService = new NotificacionService(FactoryRegistry.getFactory("sms").crearNotificacion());
        smsService.procesar("Hola desde SMS Factory");
    }
	
	

}
