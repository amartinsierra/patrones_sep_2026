package com.cursopatrones.strategy.implementaciones;

import java.util.List;

import com.cursopatrones.strategy.interfaz.BusquedaStrategy;
import com.cursopatrones.strategy.model.Usuario;

public class BusquedaPorEmail implements BusquedaStrategy {
    public List<Usuario> buscar(List<Usuario> usuarios, String criterio) {
        return usuarios.stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(criterio))
                .toList();
    }
}

