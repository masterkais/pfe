package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.GroupeDao;
import com.asm.pfe.pfeback.persistance.entities.Groupe;
import com.asm.pfe.pfeback.service.interfaceService.IGroupService;
import com.asm.pfe.pfeback.service.interfaceService.IGroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupeService implements IGroupeService {
    @Autowired
    GroupeDao groupeDao;
    @Override
    public Groupe save(Groupe groupDto) {
        return groupeDao.save(groupDto);
    }

    @Override
    public Groupe update(Groupe group) {
        return groupeDao.saveAndFlush(group);
    }

    @Override
    public Groupe findById(Long id) {
        return groupeDao.findById(id).get();
    }

    @Override
    public List<Groupe> findAllEGroupe() {
        return groupeDao.findAll();
    }

    @Override
    public void delete(Long id) {
groupeDao.deleteById(id);
    }
}
