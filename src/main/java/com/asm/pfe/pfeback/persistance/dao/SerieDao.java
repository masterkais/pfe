package com.asm.pfe.pfeback.persistance.dao;

import com.asm.pfe.pfeback.persistance.entities.Exercice;
import com.asm.pfe.pfeback.persistance.entities.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SerieDao extends JpaRepository<Serie,Long> {
    @Query(value = "select * from t_serie where exercice_id = :id", nativeQuery = true)
    List<Serie> getAllSerieByExercice(@Param("id") Long id);
}
