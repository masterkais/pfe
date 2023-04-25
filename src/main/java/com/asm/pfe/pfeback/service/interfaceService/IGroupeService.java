package com.asm.pfe.pfeback.service.interfaceService;

import com.asm.pfe.pfeback.persistance.entities.Groupe;

import java.util.List;

public interface IGroupeService {
    Groupe save(Groupe groupDto);

    Groupe update(Groupe group);

    Groupe findById(Long id);

    List<Groupe> findAllEGroupe();

    void delete(Long id);

}
