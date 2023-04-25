package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.ExerciceDao;
import com.asm.pfe.pfeback.persistance.entities.Exercice;
import com.asm.pfe.pfeback.service.interfaceService.IExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExerciceService implements IExerciceService {
    @Autowired
    ExerciceDao exerciceDao;
    @Override
    public Exercice save(Exercice exercice) {
        return exerciceDao.save(exercice);
    }

    @Override
    public Exercice update(Exercice exercice) {
        return exerciceDao.saveAndFlush(exercice);
    }

    @Override
    public Exercice findById(Long id) {
        return exerciceDao.findById(id).get();
    }

    @Override
    public List<Exercice> findAllExercice() {
        return exerciceDao.findAll();
    }

    @Override
    public void delete(Long id) {
exerciceDao.deleteById(id);
    }
}
