package originador;

import memento.DocumentoMemento;

public class Documento  {
    private String contenido = "";
    

    public void escribir(String texto) {
        contenido += texto;
        
    }

    public DocumentoMemento guardar() {
        return new DocumentoMemento(contenido);
    }

    public void restaurar(DocumentoMemento memento) {
        contenido = memento.getContenido();
       
    }

    public String getContenido() {
        return contenido;
    }

    
}

