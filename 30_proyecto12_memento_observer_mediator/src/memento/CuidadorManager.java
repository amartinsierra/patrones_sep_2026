package memento;

import java.util.Stack;

public class CuidadorManager {
    private final Stack<DocumentoMemento> historial = new Stack<>();
    public void guardar(DocumentoMemento snapshot) {
        historial.push(snapshot);
    }
    public DocumentoMemento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}
