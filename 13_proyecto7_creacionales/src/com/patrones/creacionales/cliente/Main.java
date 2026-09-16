package com.patrones.creacionales.cliente;

import com.patrones.creacionales.service.UsuarioService;

public class Main {
    public static void main(String[] args) {
    	UsuarioService usuarioService = new UsuarioService();

        usuarioService.enviarUsuario("admin", "Alice", "a@a");
        usuarioService.enviarUsuario("operador", "Bob", "b@b");
        usuarioService.enviarUsuario("invitado", "Charlie", "c@c");

        
    }
    
   
}

