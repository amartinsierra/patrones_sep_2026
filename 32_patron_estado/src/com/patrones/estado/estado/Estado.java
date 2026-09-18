package com.patrones.estado.estado;

import com.patrones.estado.contexto.Pedido;

public interface Estado {
    void pagar(Pedido pedido);
    void enviar(Pedido pedido);
}
