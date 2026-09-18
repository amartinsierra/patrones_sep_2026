package com.cursopatrones.visitor.visitados;

import com.cursopatrones.visitor.visitantes.FiguraVisitor;

public final class Rectangulo implements Figura {
    public double ancho, alto;
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho; this.alto = alto;
    }

    @Override
    public void accept(FiguraVisitor visitor) {
        visitor.visit(this);
    }
}
