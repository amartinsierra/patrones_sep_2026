package com.cursopatrones.command.implementacion;

import com.cursopatrones.command.interfaz.Command;
import com.cursopatrones.command.model.Producto;
import com.cursopatrones.command.repository.OrderRepository;

public class CreateOrderCommand implements Command {
    private final OrderRepository orderRepository;
    
    public CreateOrderCommand(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Override
    public void execute() {
        System.out.println("Pedido creado.");
        // lógica real: 
        orderRepository.save(new Producto());
    }
} 
