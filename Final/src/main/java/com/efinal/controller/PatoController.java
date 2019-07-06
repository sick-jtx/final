package com.efinal.controller;

import com.efinal.model.Pato;
import com.efinal.service.PatoService;
import com.efinal.service.implementacion.PatoServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatoController {
    private PatoService patoService;
    public PatoController(){
        this.patoService = new PatoServiceImpl();
    }

    public void listAll(){
        List<Pato> patos = patoService.ListAll();
        imprimir(patos);
    }

    public void findById(){
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        Pato pato = patoService.findById(id);
        List<Pato> patos = new ArrayList<>();
        patos.add(pato);
        imprimir(patos);
    }

    public void delete(){
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        Pato pato = patoService.findById(id);
        patoService.delete(pato);
    }

    public void update(){
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el id que quiere modificar: ");
        int id = s.nextInt();
        System.out.print("Ingrese el nombre nuevo: ");
        String nombre = s.next();
        System.out.print("Ingrese el color nuevo: ");
        String color = s.next();
        System.out.print("Ingrese la raza nueva: ");
        String raza = s.next();
        Pato pato = new Pato();
        pato.setId(id);
        pato.setRaza(raza);
        pato.setNombre(nombre);
        pato.setColor(color);
        patoService.update(pato);
    }

    public void guardar(){
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el id: ");
        int id = s.nextInt();
        System.out.print("Ingrese el nombre: ");
        String nombre = s.next();
        System.out.print("Ingrese el color: ");
        String color = s.next();
        System.out.print("Ingrese la raza: ");
        String raza = s.next();
        Pato pato = new Pato();
        pato.setId(id);
        pato.setRaza(raza);
        pato.setNombre(nombre);
        pato.setColor(color);
        patoService.save(pato);
    }
    private void imprimir(List<Pato> patos){
        System.out.println("Id\tNombre\tColor\tRaza");
        for(Pato pato : patos){
            System.out.println(pato.getId()+"\t"+pato.getNombre()+"\t"+pato.getColor()+"\t"+pato.getRaza());
        }
    }
}
