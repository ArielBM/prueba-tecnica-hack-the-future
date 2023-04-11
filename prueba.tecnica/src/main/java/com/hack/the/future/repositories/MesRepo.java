package com.hack.the.future.repositories;

import com.hack.the.future.entities.Mes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesRepo extends JpaRepository<Mes, Integer> {

}
