package com.hack.the.future.services;

import com.hack.the.future.entities.TipoEmision;
import com.hack.the.future.repositories.TipoEmisionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEmisionService {
    @Autowired
    private TipoEmisionRepo tipoEmisionRepo;

    public TipoEmision insertar(TipoEmision tipoEmision){
        return tipoEmisionRepo.save(tipoEmision);
    }

    public TipoEmision actualizar(TipoEmision tipoEmision){
        return tipoEmisionRepo.save(tipoEmision);
    }

    public List<TipoEmision> listar(){
        return tipoEmisionRepo.findAll();
    }

    public void eliminar(TipoEmision tipoEmision){
        tipoEmisionRepo.delete(tipoEmision);
    }

    public TipoEmision obtener(int id) {return tipoEmisionRepo.findById(id).orElse(null);}
}
