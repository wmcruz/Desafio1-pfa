package com.desafio1pfa.desafio1pfa.repository;

import com.desafio1pfa.desafio1pfa.model.ModuloFullCycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloFullCycleRepository extends JpaRepository<ModuloFullCycle, Long> {
}