package com.cursopatrones.visitor.visitados;

import com.cursopatrones.visitor.visitantes.FiguraVisitor;

public sealed interface Figura permits Circulo,Rectangulo{
    void accept(FiguraVisitor visitor);
}
