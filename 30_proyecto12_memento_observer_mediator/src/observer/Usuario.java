package observer;

import mediador.ChatMediador;

public class Usuario implements Observador {
    private String nombre;
   
    private ChatMediador mediador;
    public Usuario(String nombre,ChatMediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
        
    }

    @Override
    public void actualizar(String nuevoContenido) {
        System.out.println(nombre + " ve el nuevo contenido: " + nuevoContenido);
    }

   

    public String getNombre() {
        return nombre;
    }
    
    public void enviar(String mensaje) {
        System.out.println(this.nombre + " envía: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje) {
        System.out.println(this.nombre + " recibe: " + mensaje);
    }
}

