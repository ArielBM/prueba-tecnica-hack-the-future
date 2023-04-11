package com.hack.the.future.repositories;

import com.hack.the.future.entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepo extends JpaRepository<Equipo,Integer> {
}
