package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.ActiviteCollectivesDao;
import com.asm.pfe.pfeback.persistance.entities.ActivitesCollectives;
import com.asm.pfe.pfeback.service.implService.ActiviteCollectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/activtieCollective")
public class ActivtieCollectiveConroller {
    @Autowired
    ActiviteCollectiveService activiteCollectiveService;
    @PostMapping()
    public ActivitesCollectives save(@RequestBody ActivitesCollectives activitesCollectives) {
        return activiteCollectiveService.save(activitesCollectives);
    }
    @PutMapping()
    public ActivitesCollectives update(@RequestBody ActivitesCollectives activitesCollectives) {
        return activiteCollectiveService.update(activitesCollectives);
    }
    @GetMapping(value = "/activtieCollective/{id}")
    public ActivitesCollectives findById(@PathVariable Long id) {
        return activiteCollectiveService.findById(id);
    }
    @GetMapping(value = "/activtieCollectives")
    public List<ActivitesCollectives> findAllActivitesCollectives() {
        return activiteCollectiveService.findAllActivitesCollectives();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        activiteCollectiveService.delete(id);
    }

}
