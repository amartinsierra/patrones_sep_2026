package com.patrones.proyecto.buena.canales;

public class CanalEmail implements CanalNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("📧 Email enviado: " + mensaje);
    }
}

