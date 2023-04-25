package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.Group;
import com.asm.pfe.pfeback.persistance.entities.Serie;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ISerieService {

    Serie save(Serie groupDto);

    Serie update(Serie group);

    Serie findById(Long id);

    List<Serie> findAllESerie();

    void delete(Long id);

}
