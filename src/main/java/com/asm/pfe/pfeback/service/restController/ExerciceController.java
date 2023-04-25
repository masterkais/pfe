package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.ExerciceDao;
import com.asm.pfe.pfeback.persistance.entities.Exercice;
import com.asm.pfe.pfeback.service.interfaceService.IExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/api/exercice")
public class ExerciceController implements IExerciceService {
    @Autowired
    IExerciceService exerciceService;

    @PostMapping()
    public Exercice save(Exercice exercice) {
        return exerciceService.save(exercice);
    }

    @PutMapping()
    public Exercice update(Exercice exercice) {
        return exerciceService.update(exercice);
    }
    @GetMapping(value = "/groups")
    public Exercice findById(Long id) {
        return exerciceService.findById(id);
    }
    @GetMapping(value = "/groups")
    public List<Exercice> findAllExercice() {
        return exerciceService.findAllExercice();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        exerciceService.delete(id);
    }
}
