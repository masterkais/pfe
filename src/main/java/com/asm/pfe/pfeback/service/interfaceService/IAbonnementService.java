package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.Abonnement;
import com.asm.pfe.pfeback.persistance.entities.ActivitesCollectives;

import java.util.List;

public interface IAbonnementService {
    Abonnement save(Abonnement abonnement);

    Abonnement update(Abonnement abonnement);

    Abonnement findById(Long id);

    List<Abonnement> findAllAbonnement();

    void delete(Long id);
}
