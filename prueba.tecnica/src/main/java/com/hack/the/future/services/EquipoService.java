package com.hack.the.future.services;

import com.hack.the.future.entities.Equipo;
import com.hack.the.future.repositories.EquipoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EquipoService {

    @Autowired
    private EquipoRepo equipoRepo;

    public Equipo insertar(Equipo equipo){
        return equipoRepo.save(equipo);
    }

    public Equipo actualizar(Equipo equipo){
        return equipoRepo.save(equipo);
    }

    public List<Equipo> listar(){
        return equipoRepo.findAll();
    }

    public void eliminar(Equipo equipo){
        equipoRepo.delete(equipo);
    }

    public Equipo obtener(int id) {return equipoRepo.findById(id).orElse(null);}

}
