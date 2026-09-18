package com.patrones.comportamiento.tienda.service;

import com.patrones.comportamiento.tienda.command.Comando;
import com.patrones.comportamiento.tienda.command.ComandoCancelar;
import com.patrones.comportamiento.tienda.command.ComandoEnviar;
import com.patrones.comportamiento.tienda.command.ComandoPagar;
import com.patrones.comportamiento.tienda.model.Pedido;
import com.patrones.comportamiento.tienda.strategy.EstrategiaDescuento;

public class PedidosService {
    private EstrategiaDescuento estrategia;

    public PedidosService(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }
    public void procesarPedido(Pedido pedido) {
		pedido.setPrecio(estrategia.aplicarDescuento(pedido.getPrecio()));
		//ejecutamos comandos de pago y envio
		Comando pagar = new ComandoPagar(pedido);
        Comando enviar = new ComandoEnviar(pedido);
        try {
        	pagar.ejecutar();
            enviar.ejecutar();
        }catch(Exception ex) {
        	new ComandoCancelar(pedido).ejecutar();
        }
        

	}
    
}
