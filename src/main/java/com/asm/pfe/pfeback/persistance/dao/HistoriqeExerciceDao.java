package com.asm.pfe.pfeback.persistance.dao;

import com.asm.pfe.pfeback.persistance.entities.Groupe;
import com.asm.pfe.pfeback.persistance.entities.HistoriqueExercice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqeExerciceDao extends JpaRepository<HistoriqueExercice, Long> {
}
