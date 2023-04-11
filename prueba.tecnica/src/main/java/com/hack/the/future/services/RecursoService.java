package com.hack.the.future.services;

import com.hack.the.future.entities.Recurso;
import com.hack.the.future.repositories.RecursoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepo recursoRepo;

    public Recurso insertar(Recurso recurso){
        return recursoRepo.save(recurso);
    }

    public Recurso actualizar(Recurso recurso){
        return recursoRepo.save(recurso);
    }

    public List<Recurso> listar(){
        return recursoRepo.findAll();
    }

    public void eliminar(Recurso recurso){
        recursoRepo.delete(recurso);
    }

    public Recurso obtener(int id) {return recursoRepo.findById(id).orElse(null);}
}
