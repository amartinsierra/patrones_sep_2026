package com.patrones.proyecto.buena.descuentos;

import com.patrones.proyecto.buena.pedidos.Pedido;

public abstract class DescuentoDecorador implements Pedido {

	protected Pedido pedido;

    public DescuentoDecorador(Pedido pedido) {
        this.pedido = pedido;
    }


}
