package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.Exercice;
import com.asm.pfe.pfeback.persistance.entities.Groupe;

import java.util.List;

public interface IExerciceService {
    Exercice save(Exercice exercice);

    Exercice update(Exercice exercice);

    Exercice findById(Long id);

    List<Exercice> findAllExercice();

    void delete(Long id);

    List<Exercice> getAllExerciceByType(Long id);
}
