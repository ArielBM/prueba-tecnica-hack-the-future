package com.hack.the.future.repositories;

import com.hack.the.future.entities.Anio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnioRepo extends JpaRepository<Anio,Integer> {
}
