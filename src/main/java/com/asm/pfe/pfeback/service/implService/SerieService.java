package com.asm.pfe.pfeback.service.implService;

import com.asm.pfe.pfeback.persistance.dao.SerieDao;
import com.asm.pfe.pfeback.persistance.entities.Serie;
import com.asm.pfe.pfeback.service.interfaceService.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SerieService implements ISerieService {
    @Autowired
    SerieDao serieDao;

    @Override
    public Serie save(Serie groupDto) {
        return serieDao.save(groupDto);
    }

    @Override
    public Serie update(Serie group) {
        return serieDao.saveAndFlush(group);
    }

    @Override
    public Serie findById(Long id) {
        return serieDao.findById(id).get();
    }

    @Override
    public List<Serie> findAllESerie() {
        return serieDao.findAll();
    }

    @Override
    public void delete(Long id) {
        serieDao.deleteById(id);
    }
}
