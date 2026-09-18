package mediador;

import observer.Usuario;

public interface ChatMediador {
    void enviarMensaje(String mensaje, Usuario emisor);
    void registrarUsuario(Usuario usuario);
}
