package com.hack.the.future.services;

import com.hack.the.future.entities.Mes;
import com.hack.the.future.repositories.MesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesService {

    @Autowired
    private MesRepo mesRepo;

    public Mes insertar(Mes mes){
        return mesRepo.save(mes);
    }

    public Mes actualizar(Mes mes){
        return mesRepo.save(mes);
    }

    public List<Mes> listar(){
        return mesRepo.findAll();
    }

    public void eliminar(Mes mes){
        mesRepo.delete(mes);
    }

    public Mes obtener(int id) {return  mesRepo.findById(id).orElse(null);}
}
