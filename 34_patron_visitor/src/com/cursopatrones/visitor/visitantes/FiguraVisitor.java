package com.cursopatrones.visitor.visitantes;

import com.cursopatrones.visitor.visitados.Circulo;
import com.cursopatrones.visitor.visitados.Rectangulo;

public interface FiguraVisitor {
    void visit(Circulo c);
    void visit(Rectangulo r);
}
