package com.hack.the.future.services;

import com.hack.the.future.entities.Viaje;
import com.hack.the.future.repositories.ViajeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeService {
    @Autowired
    private ViajeRepo viajeRepo;

    public Viaje insertar(Viaje viaje){
        return viajeRepo.save(viaje);
    }

    public Viaje actualizar(Viaje viaje){
        return viajeRepo.save(viaje);
    }

    public List<Viaje> listar(){
        return viajeRepo.findAll();
    }

    public void eliminar(Viaje viaje){
        viajeRepo.delete(viaje);
    }

    public Viaje obtener(int id) {return viajeRepo.findById(id).orElse(null);}
}
