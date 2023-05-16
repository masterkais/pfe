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
public class ExerciceController {
    @Autowired
    IExerciceService exerciceService;

    @GetMapping(value = "/getAllExerciceByType/{id}")
    public List<Exercice>  getAllExerciceByType(@PathVariable Long id) {
        return exerciceService.getAllExerciceByType(id);
    }

    @PostMapping()
    public Exercice save(@RequestBody Exercice exercice) {
        return exerciceService.save(exercice);
    }

    @PutMapping()
    public Exercice update(@RequestBody Exercice exercice) {
        return exerciceService.update(exercice);
    }
    @GetMapping(value = "/exercice/{id}")
    public Exercice findById(@PathVariable Long id) {
        return exerciceService.findById(id);
    }
    @GetMapping(value = "/exercices")
    public List<Exercice> findAllExercice() {
        return exerciceService.findAllExercice();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        exerciceService.delete(id);
    }
}
