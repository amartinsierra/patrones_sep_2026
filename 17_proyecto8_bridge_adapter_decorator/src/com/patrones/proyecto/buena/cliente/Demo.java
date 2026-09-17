package com.patrones.proyecto.buena.cliente;

import com.patrones.proyecto.buena.adapter.CanalEmailAdapter;
import com.patrones.proyecto.buena.canales.CanalNotificacion;
import com.patrones.proyecto.buena.canales.CanalSms;
import com.patrones.proyecto.buena.descuentos.DescuentoVip;
import com.patrones.proyecto.buena.notificaciones.Notificacion;
import com.patrones.proyecto.buena.notificaciones.NotificacionConfirmacion;
import com.patrones.proyecto.buena.notificaciones.NotificacionRecordatorio;
import com.patrones.proyecto.buena.pedidos.Pedido;
import com.patrones.proyecto.buena.pedidos.PedidoBase;

public class Demo {

	public static void main(String[] args) {
		// Pedido con descuento
        Pedido pedido = new PedidoBase("Libro", 100);
        pedido = new DescuentoVip(pedido);
        //enviamos notificación por sms
        CanalNotificacion canalSms = new CanalSms();
        Notificacion notificacionSms = new NotificacionRecordatorio(canalSms);
        notificacionSms.enviarMensaje(pedido.getProducto() + " por " + pedido.getPrecio());
       
        // Usamos Bridge con Adapter para enviar la notificación
        CanalNotificacion canal = new CanalEmailAdapter();
        Notificacion notificacion = new NotificacionConfirmacion(canal);

        notificacion.enviarMensaje(pedido.getProducto() + " por " + pedido.getPrecio());
			

	}

}
