package com.cursopatrones.proxy.real;

import com.cursopatrones.proxy.interfaz.MissileSystem;

public class RealMissileSystem implements MissileSystem {
    @Override
    public void launch() {
        System.out.println("Misil lanzado con éxito!");
    }
}