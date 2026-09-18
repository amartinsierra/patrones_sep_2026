package com.cursopatrones.visitor.visitantes;

import com.cursopatrones.visitor.visitados.Circulo;
import com.cursopatrones.visitor.visitados.Rectangulo;

public class DibujarVisitor implements FiguraVisitor {
    @Override
    public void visit(Circulo c) {
        System.out.println("Dibujando un círculo de radio " + c.radio);
    }
    @Override
    public void visit(Rectangulo r) {
        System.out.println("Dibujando un rectángulo " + r.ancho + "x" + r.alto);
    }
}

