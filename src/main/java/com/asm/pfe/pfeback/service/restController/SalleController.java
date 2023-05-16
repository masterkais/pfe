package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.SalleDao;
import com.asm.pfe.pfeback.persistance.entities.Salle;
import com.asm.pfe.pfeback.service.implService.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/salle")
public class SalleController {
    @Autowired
    SalleService salleService;
    @PostMapping()
    public Salle save(@RequestBody Salle salle) {
        return salleService.save(salle);
    }
    @PutMapping()
    public Salle update(@RequestBody Salle salle) {
        return salleService.update(salle);
    }
    @GetMapping(value = "/salle/{id}")
    public Salle findById(@PathVariable Long id) {
        return salleService.findById(id);
    }
    @GetMapping(value = "/salles")
    public List<Salle> findAllSalle() {
        return salleService.findAllSalle();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        salleService.delete(id);
    }

}
