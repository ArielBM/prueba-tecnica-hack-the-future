package com.hack.the.future.services;

import com.hack.the.future.entities.Unidad;
import com.hack.the.future.repositories.UnidadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadService {

    @Autowired
    private UnidadRepo unidadRepo;

    public Unidad insertar(Unidad unidad){
        return unidadRepo.save(unidad);
    }

    public Unidad actualizar(Unidad unidad){
        return unidadRepo.save(unidad);
    }

    public List<Unidad> listar(){
        return unidadRepo.findAll();
    }

    public void eliminar(Unidad unidad){
        unidadRepo.delete(unidad);
    }

    public Unidad obtener(int id) {return unidadRepo.findById(id).orElse(null);}
}
