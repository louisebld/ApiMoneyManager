package com.lou.ApiMoneyManager.services;

import com.lou.ApiMoneyManager.models.Depense;
import com.lou.ApiMoneyManager.repository.DepenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepenseServiceImpl implements DepenseService{

    private final DepenseRepository depenseRepository;


    @Override
    public Depense creer(Depense depense) {
        return depenseRepository.save(depense);
    }

    @Override
    public List<Depense> lire() {
        return depenseRepository.findAll();
    }

    @Override
    public Depense lire(long id) {
        return depenseRepository.findById(id).orElse(null);
    }

    @Override
    public Depense modifier(long id, Depense depense) {
        return depenseRepository.findById(id).map(d->{
            d.setName(depense.getName());
            d.setCategorie(depense.getCategorie());
            d.setDate(depense.getDate());
            d.setPrix(depense.getPrix());
            return depenseRepository.save(d);
        }).orElseThrow(() -> new RuntimeException("Depense not found"));
    }


    @Override
    public String supprimer(long id) {
        depenseRepository.deleteById(id);
        return "Depense supprimée";
    }
}
