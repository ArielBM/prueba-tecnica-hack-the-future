package com.hack.the.future.repositories;

import com.hack.the.future.entities.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadRepo extends JpaRepository<Unidad,Integer> {
}
