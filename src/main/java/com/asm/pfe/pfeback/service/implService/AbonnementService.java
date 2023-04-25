package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.AbonnementDao;
import com.asm.pfe.pfeback.persistance.entities.Abonnement;
import com.asm.pfe.pfeback.service.interfaceService.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AbonnementService implements IAbonnementService {
    @Autowired
    AbonnementDao abonnementDao;

    @Override
    public Abonnement save(Abonnement abonnement) {
        return abonnementDao.save(abonnement);
    }

    @Override
    public Abonnement update(Abonnement abonnement) {
        return abonnementDao.saveAndFlush(abonnement);
    }

    @Override
    public Abonnement findById(Long id) {
        return abonnementDao.findById(id).get();
    }

    @Override
    public List<Abonnement> findAllAbonnement() {
        return abonnementDao.findAll();
    }

    @Override
    public void delete(Long id) {
        abonnementDao.deleteById(id);
    }
}
