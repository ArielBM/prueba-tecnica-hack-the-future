package com.hack.the.future.services;

import com.hack.the.future.entities.TipoConsumo;
import com.hack.the.future.repositories.TipoConsumoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoConsumoService {

    @Autowired
    private TipoConsumoRepo tipoConsumoRepo;

    public TipoConsumo insertar(TipoConsumo tipoConsumo){
        return tipoConsumoRepo.save(tipoConsumo);
    }

    public TipoConsumo actualizar(TipoConsumo tipoConsumo){
        return tipoConsumoRepo.save(tipoConsumo);
    }

    public List<TipoConsumo> listar(){
        return tipoConsumoRepo.findAll();
    }

    public void eliminar(TipoConsumo tipoConsumo){
        tipoConsumoRepo.delete(tipoConsumo);
    }

    public TipoConsumo obtener(int id) {return tipoConsumoRepo.findById(id).orElse(null);}
}
