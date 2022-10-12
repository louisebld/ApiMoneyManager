package com.lou.apimoneymanager.controller;

import com.lou.apimoneymanager.models.Depense;
import com.lou.apimoneymanager.services.DepenseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/depense")
@AllArgsConstructor

public class DepenseController {
    private final DepenseService depenseService;

    @PostMapping("/create")
    public Depense create(@RequestBody Depense d){
        return depenseService.creer(d);
    }

    @GetMapping("/read")
    public List<Depense> read(){
        return depenseService.lire();
    }

    @PutMapping("/update/{id}")
    public Depense update(@PathVariable long id, @RequestBody Depense d){
        return depenseService.modifier(id, d);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        return depenseService.supprimer(id);
    }

}