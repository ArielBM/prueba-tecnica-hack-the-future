package com.hack.the.future.repositories;

import com.hack.the.future.entities.TipoEmision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmisionRepo extends JpaRepository<TipoEmision,Integer> {
}
