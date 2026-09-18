package com.patrones.estado.contexto;

import com.patrones.estado.estado.Estado;
import com.patrones.estado.estado.Nuevo;

public class Pedido {
    private Estado estado;
    public Pedido() {
        this.estado = new Nuevo(); // arranca como nuevo
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void pagar() {
        estado.pagar(this);
    }
    public void enviar() {
        estado.enviar(this);
    }
}
