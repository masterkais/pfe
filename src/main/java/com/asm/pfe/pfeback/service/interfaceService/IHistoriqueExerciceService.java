package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.Abonnement;
import com.asm.pfe.pfeback.persistance.entities.HistoriqueExercice;

import java.util.List;

public interface IHistoriqueExerciceService {
    HistoriqueExercice save(HistoriqueExercice historiqueExercice);

    HistoriqueExercice update(HistoriqueExercice historiqueExercice);

    HistoriqueExercice findById(Long id);

    List<HistoriqueExercice> findAllHistoriqueExercice();

    void delete(Long id);
}
