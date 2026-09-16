package com.patrones.adapter.legacy;

import java.util.ArrayList;
import java.util.List;

public class Info{
    private List<String> lst=new ArrayList<>();
    
    //constructor, setter y getter
    public void register(String texto){
        System.out.println(texto);
    }
    public void save(String texto){
        lst.add(texto);
    }
}
