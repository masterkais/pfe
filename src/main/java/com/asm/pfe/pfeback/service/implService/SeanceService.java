package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.SeanceDao;
import com.asm.pfe.pfeback.persistance.entities.Seance;
import com.asm.pfe.pfeback.service.interfaceService.ISeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeanceService implements ISeanceService {
    @Autowired
    SeanceDao seanceDao;

    @Override
    public Seance save(Seance seance) {
        return seanceDao.save(seance);
    }

    @Override
    public Seance update(Seance seance) {
        return seanceDao.saveAndFlush(seance);
    }

    @Override
    public Seance findById(Long id) {
        return seanceDao.findById(id).get();
    }

    @Override
    public List<Seance> findAllSeance() {
        return seanceDao.findAll();
    }

    @Override
    public void delete(Long id) {
        seanceDao.deleteById(id);
    }
}
