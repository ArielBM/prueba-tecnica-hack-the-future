package com.hack.the.future.services;

import com.hack.the.future.entities.*;
import com.hack.the.future.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumoService {

    @Autowired
    private ConsumoRepo consumoRepo;

    public Consumo insertar(Consumo consumo){
        return consumoRepo.save(consumo);
    }

    public Consumo actualizar(Consumo consumo){
        return consumoRepo.save(consumo);
    }

    public List<Consumo> listar(){
        return consumoRepo.findAll();
    }

    public void eliminar(Consumo consumo){
        consumoRepo.delete(consumo);
    }

    public Consumo obtener(int id) {return consumoRepo.findById(id).orElse(null);}
}
