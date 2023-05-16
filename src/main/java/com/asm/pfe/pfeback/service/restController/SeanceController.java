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
    public Seance save(@RequestBody Seance seance) {
        return seanceService.save(seance);
    }
    @PutMapping()
    public Seance update(@RequestBody Seance seance) {
        return seanceService.update(seance);
    }
    @GetMapping(value = "/seance/{id}")
    public Seance findById(Long id) {
        return seanceService.findById(id);
    }
    @GetMapping(value = "/seances")
    public List<Seance> findAllSeance() {
        return seanceService.findAllSeance();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        seanceService.delete(id);
    }
}
