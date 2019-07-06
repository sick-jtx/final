package com.efinal.service.implementacion;

import com.efinal.dao.PatoRepository;
import com.efinal.dao.implementacion.PatoRepositoryImpl;
import com.efinal.model.Pato;
import com.efinal.service.PatoService;
import com.efinal.singleton.PatosMemoria;

import java.util.Collection;
import java.util.List;

public class PatoServiceImpl implements PatoService {

    private PatoRepository patoRepository;

    public PatoServiceImpl(){
        this.patoRepository = new PatoRepositoryImpl();
    }


    @Override
    public List<Pato> ListAll() {

        return patoRepository.ListAll();
    }

    @Override
    public Pato save(Pato pato) {
        return patoRepository.save(pato);
    }

    @Override
    public Pato update(Pato pato){
        return patoRepository.update(pato);
    }

    @Override
    public Pato delete(Pato pato) {
        return patoRepository.delete(pato);
    }

    @Override
    public Pato findById(int id) {
        return patoRepository.findById(id);
    }
}
