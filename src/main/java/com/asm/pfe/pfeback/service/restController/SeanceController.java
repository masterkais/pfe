package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.SeanceDao;
import com.asm.pfe.pfeback.persistance.entities.Seance;
import com.asm.pfe.pfeback.service.implService.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/seance")
public class SeanceController {
    @Autowired
    SeanceService seanceService;
    @PostMapping()
    public Seance save(Seance seance) {
        return seanceService.save(seance);
    }
    @PutMapping()
    public Seance update(Seance seance) {
        return seanceService.update(seance);
    }
    @GetMapping(value = "/groups")
    public Seance findById(Long id) {
        return seanceService.findById(id);
    }
    @GetMapping(value = "/groups")
    public List<Seance> findAllSeance() {
        return seanceService.findAllSeance();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        seanceService.delete(id);
    }
}
