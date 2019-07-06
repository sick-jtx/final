package com.efinal.singleton;

import com.efinal.model.Pato;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class PatosMemoria {
    public static PatosMemoria instance=null;

    private List<Pato> patos;

    private PatosMemoria() {
        patos = new ArrayList<>();
    }

    public static PatosMemoria getInstance() {
        if(instance==null){
            instance=new PatosMemoria();
        }
        return instance;
    }
    public List<Pato> getPatos(){
        return patos;
    }
}
