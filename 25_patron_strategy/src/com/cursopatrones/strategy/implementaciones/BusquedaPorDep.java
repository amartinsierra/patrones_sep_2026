package com.cursopatrones.strategy.implementaciones;

import java.util.List;

import com.cursopatrones.strategy.interfaz.BusquedaStrategy;
import com.cursopatrones.strategy.model.Usuario;

public class BusquedaPorDep implements BusquedaStrategy {
    public List<Usuario> buscar(List<Usuario> usuarios, String criterio) {
        return usuarios.stream()
                .filter(u -> u.getDepartamento().equalsIgnoreCase(criterio))
                .toList();
    }
}

