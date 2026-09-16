package com.patrones.adapter.target;

import com.patrones.adapter.legacy.Info;

public class Adapter implements Mensaje{
    private Info info;
    public Adapter(Info info){
        this.info=info;
    }
    @Override
    public void send(String texto){
        //info.setTexto(texto);
        info.save(texto);
        info.register(texto);
    }
}
