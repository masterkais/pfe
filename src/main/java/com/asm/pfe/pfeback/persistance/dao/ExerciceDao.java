package com.asm.pfe.pfeback.persistance.dao;

import com.asm.pfe.pfeback.persistance.entities.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExerciceDao extends JpaRepository<Exercice, Long> {
    @Query(value = "select * from t_exercice where type_exercice_id = :id", nativeQuery = true)
    List<Exercice> getAllExerciceByType(@Param("id") Long id);
}
