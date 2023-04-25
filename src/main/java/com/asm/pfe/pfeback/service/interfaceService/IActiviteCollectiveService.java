package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.ActivitesCollectives;
import com.asm.pfe.pfeback.persistance.entities.Exercice;

import java.util.List;

public interface IActiviteCollectiveService {
    ActivitesCollectives save(ActivitesCollectives activitesCollectives);

    ActivitesCollectives update(ActivitesCollectives activitesCollectives);

    ActivitesCollectives findById(Long id);

    List<ActivitesCollectives> findAllActivitesCollectives();

    void delete(Long id);
}
