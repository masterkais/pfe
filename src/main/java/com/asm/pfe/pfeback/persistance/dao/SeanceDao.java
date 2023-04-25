package com.asm.pfe.pfeback.persistance.dao;

import com.asm.pfe.pfeback.persistance.entities.Groupe;
import com.asm.pfe.pfeback.persistance.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceDao extends JpaRepository<Seance, Long> {
}
