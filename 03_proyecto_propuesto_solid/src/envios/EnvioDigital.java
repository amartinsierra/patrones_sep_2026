package envios;

import productos.Producto;

public class EnvioDigital implements Envio {
	@Override
	public void enviar(Producto p) {
		System.out.println("Descarga de "+p.getNombre());
	}
}

