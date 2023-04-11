package com.hack.the.future.repositories;

import com.hack.the.future.entities.Consumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumoRepo extends JpaRepository<Consumo,Integer> {
}
