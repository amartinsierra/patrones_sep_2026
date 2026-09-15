package service;

import envios.Envio;
import productos.Producto;

public record ElementoCarrito(Producto producto,Envio envio, int cantidad) {

}
