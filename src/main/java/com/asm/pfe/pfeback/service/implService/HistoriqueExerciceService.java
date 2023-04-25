package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.HistoriqeExerciceDao;
import com.asm.pfe.pfeback.persistance.entities.HistoriqueExercice;
import com.asm.pfe.pfeback.service.interfaceService.IHistoriqueExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoriqueExerciceService implements IHistoriqueExerciceService {
    @Autowired
    HistoriqeExerciceDao historiqeExerciceDao;
    @Override
    public HistoriqueExercice save(HistoriqueExercice historiqueExercice) {
        return historiqeExerciceDao.save(historiqueExercice);
    }

    @Override
    public HistoriqueExercice update(HistoriqueExercice historiqueExercice) {
        return historiqeExerciceDao.saveAndFlush(historiqueExercice);
    }

    @Override
    public HistoriqueExercice findById(Long id) {
        return historiqeExerciceDao.findById(id).get();
    }

    @Override
    public List<HistoriqueExercice> findAllHistoriqueExercice() {
        return historiqeExerciceDao.findAll();
    }

    @Override
    public void delete(Long id) {
historiqeExerciceDao.deleteById(id);
    }
}
