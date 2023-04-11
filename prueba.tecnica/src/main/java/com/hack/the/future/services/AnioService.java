package com.hack.the.future.services;

import com.hack.the.future.entities.Anio;
import com.hack.the.future.repositories.AnioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnioService {

    @Autowired
    private AnioRepo anioRepo;

    public Anio insertar(Anio anio){
        return anioRepo.save(anio);
    }

    public Anio actualizar(Anio anio){
        return anioRepo.save(anio);
    }

    public List<Anio> listar(){
        return anioRepo.findAll();
    }

    public void eliminar(Anio anio){
        anioRepo.delete(anio);
    }

    public Anio obtener(int id) {return anioRepo.findById(id).orElse(null);}
}
