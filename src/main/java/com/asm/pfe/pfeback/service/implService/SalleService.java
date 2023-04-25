package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.SalleDao;
import com.asm.pfe.pfeback.persistance.entities.Salle;
import com.asm.pfe.pfeback.service.interfaceService.ISalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalleService implements ISalleService {
    @Autowired
    SalleDao salleDao;
    @Override
    public Salle save(Salle salle) {
        return salleDao.save(salle);
    }

    @Override
    public Salle update(Salle salle) {
        return salleDao.saveAndFlush(salle);
    }

    @Override
    public Salle findById(Long id) {
        return salleDao.findById(id).get();
    }

    @Override
    public List<Salle> findAllSalle() {
        return salleDao.findAll();
    }

    @Override
    public void delete(Long id) {
salleDao.deleteById(id);
    }
}
