package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.AbonnementDao;
import com.asm.pfe.pfeback.persistance.entities.Abonnement;
import com.asm.pfe.pfeback.service.implService.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/api/abonnement")
public class AbonnementController {
    @Autowired
    AbonnementService abonnementService;
    @PostMapping()
    public Abonnement save(@RequestBody Abonnement abonnement) {
        return abonnementService.save(abonnement);
    }
    @PutMapping()
    public Abonnement update(@RequestBody Abonnement abonnement) {
        return abonnementService.update(abonnement);
    }
    @GetMapping(value = "/abonnement/{id}")
    public Abonnement findById(@PathVariable  Long id) {
        return abonnementService.findById(id);
    }
    @GetMapping(value = "/abonnements")
    public List<Abonnement> findAllAbonnement() {
        return abonnementService.findAllAbonnement();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        abonnementService.delete(id);
    }

}
