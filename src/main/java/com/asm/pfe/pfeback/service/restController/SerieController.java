package com.asm.pfe.pfeback.service.restController;

import com.asm.pfe.pfeback.persistance.dao.SerieDao;
import com.asm.pfe.pfeback.persistance.entities.Serie;
import com.asm.pfe.pfeback.service.implService.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/serie")
public class SerieController {
    @Autowired
    SerieService serieService;
    @PostMapping()
    public Serie save(Serie serie) {
        return serieService.save(serie);
    }
    @PutMapping()
    public Serie update(Serie serie) {
        return serieService.save(serie);
    }
    @GetMapping(value = "/groups")
    public Serie findById(Long id) {
        return serieService.findById(id);
    }
    @GetMapping(value = "/groups")
    public List<Serie> findAllESerie() {
        return serieService.findAllESerie();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        serieService.delete(id);
    }

}
