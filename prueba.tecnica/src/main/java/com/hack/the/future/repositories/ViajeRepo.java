package com.hack.the.future.repositories;

import com.hack.the.future.entities.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepo extends JpaRepository<Viaje,Integer> {
}
