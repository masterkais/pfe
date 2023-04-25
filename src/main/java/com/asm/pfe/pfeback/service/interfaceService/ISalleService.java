package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.HistoriqueExercice;
import com.asm.pfe.pfeback.persistance.entities.Salle;

import java.util.List;

public interface ISalleService {
    Salle save(Salle salle);

    Salle update(Salle salle);

    Salle findById(Long id);

    List<Salle> findAllSalle();

    void delete(Long id);
}
