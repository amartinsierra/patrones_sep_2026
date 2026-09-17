package com.cursopatrones.command.client;

import com.cursopatrones.command.service.PedidoService;

public class Demo {

	public static void main(String[] args) {
		var pedido=new PedidoService();
		pedido.crearPedido("aa2");

	}

}
