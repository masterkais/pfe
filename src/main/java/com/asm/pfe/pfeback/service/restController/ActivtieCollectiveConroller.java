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
    public ActivitesCollectives save(ActivitesCollectives activitesCollectives) {
        return activiteCollectiveService.save(activitesCollectives);
    }
    @PutMapping()
    public ActivitesCollectives update(ActivitesCollectives activitesCollectives) {
        return activiteCollectiveService.update(activitesCollectives);
    }
    @GetMapping(value = "/groups")
    public ActivitesCollectives findById(Long id) {
        return activiteCollectiveService.findById(id);
    }
    @GetMapping(value = "/groups")
    public List<ActivitesCollectives> findAllActivitesCollectives() {
        return activiteCollectiveService.findAllActivitesCollectives();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        activiteCollectiveService.delete(id);
    }

}
