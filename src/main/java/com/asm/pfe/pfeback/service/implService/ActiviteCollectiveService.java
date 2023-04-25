package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.ActiviteCollectivesDao;
import com.asm.pfe.pfeback.persistance.entities.ActivitesCollectives;
import com.asm.pfe.pfeback.service.interfaceService.IActiviteCollectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActiviteCollectiveService implements IActiviteCollectiveService {
    @Autowired
    ActiviteCollectivesDao activiteCollectivesDao;

    @Override
    public ActivitesCollectives save(ActivitesCollectives activitesCollectives) {
        return activiteCollectivesDao.save(activitesCollectives);
    }

    @Override
    public ActivitesCollectives update(ActivitesCollectives activitesCollectives) {
        return activiteCollectivesDao.saveAndFlush(activitesCollectives);
    }

    @Override
    public ActivitesCollectives findById(Long id) {
        return activiteCollectivesDao.findById(id).get();
    }

    @Override
    public List<ActivitesCollectives> findAllActivitesCollectives() {
        return activiteCollectivesDao.findAll();
    }

    @Override
    public void delete(Long id) {
        activiteCollectivesDao.deleteById(id);
    }
}
