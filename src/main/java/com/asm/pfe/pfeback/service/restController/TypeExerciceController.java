package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.TypeExerciceDao;
import com.asm.pfe.pfeback.persistance.entities.TypeExercice;
import com.asm.pfe.pfeback.service.implService.TypeExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/typeExercice")
public class TypeExerciceController {
    @Autowired
    TypeExerciceService typeExerciceService;
    @PostMapping()
    public TypeExercice save(TypeExercice typeExercice) {
        return typeExerciceService.save(typeExercice);
    }
    @PutMapping()
    public TypeExercice update(TypeExercice typeExercice) {
        return typeExerciceService.update(typeExercice);
    }
    @GetMapping(value = "/groups")
    public TypeExercice findById(Long id) {
        return typeExerciceService.findById(id);
    }
    @GetMapping(value = "/groups")
    public List<TypeExercice> findAllTypeExercice() {
        return typeExerciceService.findAllTypeExercice();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        typeExerciceService.delete(id);
    }

}
