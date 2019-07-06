package com.efinal.dao;

import com.efinal.model.Pato;

import java.util.Collection;
import java.util.List;

public interface PatoRepository {
    public List<Pato> ListAll();
    public Pato save(Pato pato);
    public Pato update(Pato pato);
    public Pato delete(Pato pato);
    public Pato findById(int id);
}
