package com.patrones.comportamiento.tienda.cliente;

import com.patrones.comportamiento.tienda.model.Pedido;
import com.patrones.comportamiento.tienda.service.PedidosService;
import com.patrones.comportamiento.tienda.strategy.DescuentoVIP;

public class Demo {
	public static void main(String[] args) {
        Pedido pedido = new Pedido("Videojuego",60);

        

        // Strategy: aplicar distintos descuentos
        PedidosService calculadora = new PedidosService(new DescuentoVIP());

        calculadora.procesarPedido(pedido);

        
    }
	
	

}
