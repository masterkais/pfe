package com.asm.pfe.pfeback.persistance.dao;

import com.asm.pfe.pfeback.persistance.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupeDao extends JpaRepository<Groupe, Long> {
}
