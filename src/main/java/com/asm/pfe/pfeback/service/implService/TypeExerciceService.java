package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.TypeExerciceDao;
import com.asm.pfe.pfeback.persistance.entities.TypeExercice;
import com.asm.pfe.pfeback.service.interfaceService.ITypeExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeExerciceService implements ITypeExerciceService {
    @Autowired
    TypeExerciceDao typeExerciceDao;
    @Override
    public TypeExercice save(TypeExercice typeExercice) {
        return typeExerciceDao.save(typeExercice);
    }

    @Override
    public TypeExercice update(TypeExercice typeExercice) {
        return typeExerciceDao.saveAndFlush(typeExercice);
    }

    @Override
    public TypeExercice findById(Long id) {
        return typeExerciceDao.findById(id).get();
    }

    @Override
    public List<TypeExercice> findAllTypeExercice() {
        return typeExerciceDao.findAll();
    }

    @Override
    public void delete(Long id) {
     typeExerciceDao.deleteById(id);
    }
}
