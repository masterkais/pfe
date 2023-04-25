package com.asm.pfe.pfeback.persistance.dao;

import com.asm.pfe.pfeback.persistance.entities.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciceDao extends JpaRepository<Exercice, Long> {
}
