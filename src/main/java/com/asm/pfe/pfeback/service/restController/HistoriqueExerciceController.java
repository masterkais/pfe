package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.HistoriqeExerciceDao;
import com.asm.pfe.pfeback.persistance.entities.HistoriqueExercice;
import com.asm.pfe.pfeback.service.implService.HistoriqueExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/historiqueExercice")
public class HistoriqueExerciceController {
    @Autowired
    HistoriqueExerciceService historiqueExerciceService;
    @PostMapping()
    public HistoriqueExercice save(HistoriqueExercice historiqueExercice) {
        return historiqueExerciceService.save(historiqueExercice);
    }
    @PutMapping()
    public HistoriqueExercice update(HistoriqueExercice historiqueExercice) {
        return historiqueExerciceService.update(historiqueExercice);
    }
    @GetMapping(value = "/groups")
    public HistoriqueExercice findById(Long id) {
        return historiqueExerciceService.findById(id);
    }
    @GetMapping(value = "/groups")
    public List<HistoriqueExercice> findAllHistoriqueExercice() {
        return historiqueExerciceService.findAllHistoriqueExercice();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        historiqueExerciceService.delete(id);
    }
}
