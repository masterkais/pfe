package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.Salle;
import com.asm.pfe.pfeback.persistance.entities.Seance;

import java.util.List;

public interface ISeanceService {
    Seance save(Seance seance);

    Seance update(Seance seance);

    Seance findById(Long id);

    List<Seance> findAllSeance();

    void delete(Long id);
}
