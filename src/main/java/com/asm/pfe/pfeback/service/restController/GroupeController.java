package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.GroupeDao;
import com.asm.pfe.pfeback.persistance.entities.Groupe;
import com.asm.pfe.pfeback.service.implService.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/groupe")
public class GroupeController {
    @Autowired
    GroupeService groupeService;
    @PostMapping()
    public Groupe save(Groupe groupDto) {
        return groupeService.save(groupDto);
    }
    @PutMapping()
    public Groupe update(Groupe group) {
        return groupeService.update(group);
    }
    @GetMapping(value = "/groups")
    public Groupe findById(Long id) {
        return groupeService.findById(id);
    }
    @GetMapping(value = "/groups")
    public List<Groupe> findAllEGroupe() {
        return groupeService.findAllEGroupe();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        groupeService.delete(id);
    }

}
