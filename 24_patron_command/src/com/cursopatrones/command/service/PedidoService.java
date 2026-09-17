package com.cursopatrones.command.service;

import com.cursopatrones.command.implementacion.CommandDispatcher;
import com.cursopatrones.command.implementacion.CreateOrderCommand;
import com.cursopatrones.command.implementacion.SendConfirmationEmail;
import com.cursopatrones.command.implementacion.StockCommand;
import com.cursopatrones.command.repository.OrderRepository;

public class PedidoService {
    private final CommandDispatcher dispatcher = new CommandDispatcher();
    private final OrderRepository repository= new OrderRepository();
   

    public void crearPedido(String pedidoId) {
        System.out.println("Pedido creado: " + pedidoId);

        // Encapsulamos las operaciones como comandos
        dispatcher.addCommand(new StockCommand());
        dispatcher.addCommand(new CreateOrderCommand(repository));
        dispatcher.addCommand(new SendConfirmationEmail());

        // Ejecutamos los comandos
        dispatcher.dispatch();
    }
}

