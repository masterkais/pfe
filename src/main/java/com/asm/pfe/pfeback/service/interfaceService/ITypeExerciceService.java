package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.Seance;
import com.asm.pfe.pfeback.persistance.entities.TypeExercice;

import java.util.List;

public interface ITypeExerciceService {
    TypeExercice save(TypeExercice typeExercice);

    TypeExercice update(TypeExercice typeExercice);

    TypeExercice findById(Long id);

    List<TypeExercice> findAllTypeExercice();

    void delete(Long id);
}
