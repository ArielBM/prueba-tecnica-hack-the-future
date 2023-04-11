package com.hack.the.future.repositories;

import com.hack.the.future.entities.Recurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursoRepo extends JpaRepository<Recurso, Integer> {
}
