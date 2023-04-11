package com.hack.the.future.repositories;

import com.hack.the.future.entities.TipoConsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoConsumoRepo extends JpaRepository<TipoConsumo,Integer> {
}
