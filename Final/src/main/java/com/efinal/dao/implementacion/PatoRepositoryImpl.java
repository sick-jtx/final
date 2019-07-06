package com.efinal.dao.implementacion;

import com.efinal.dao.PatoRepository;
import com.efinal.model.Pato;
import com.efinal.singleton.PatosMemoria;

import java.util.Collection;
import java.util.List;

public class PatoRepositoryImpl implements PatoRepository {
    PatosMemoria patos=PatosMemoria.getInstance();


    @Override
    public List<Pato> ListAll() {
        return patos.getPatos();
    }

    @Override
    public Pato save(Pato pato) {
        patos.getPatos().add(pato);
        return pato;
    }

    @Override
    public Pato update(Pato pato) {
        for (Pato i: patos.getPatos()) {
            if(i.equals(pato))i=pato;
        }
        return pato;
    }

    @Override
    public Pato delete(Pato pato) {
        patos.getPatos().remove((pato));
        return pato;
    }

    @Override
    public Pato findById(int id) {
        Pato buscar=null;
        for (Pato i: patos.getPatos()) {
            if(i.getId()==id)buscar=i;
        }
        return buscar;
    }
}
