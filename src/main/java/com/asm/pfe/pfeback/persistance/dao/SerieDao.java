package com.asm.pfe.pfeback.persistance.dao;

import com.asm.pfe.pfeback.persistance.entities.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieDao extends JpaRepository<Serie,Long> {
}
