package com.cursopatrones.strategy.interfaz;

import java.util.List;

import com.cursopatrones.strategy.model.Usuario;

public interface BusquedaStrategy {
    List<Usuario> buscar(List<Usuario> usuarios, String criterio);
}
