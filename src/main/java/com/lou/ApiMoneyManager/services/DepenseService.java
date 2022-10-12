package com.lou.ApiMoneyManager.services;

import com.lou.ApiMoneyManager.models.Depense;
import com.lou.ApiMoneyManager.repository.DepenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepenseService {

    Depense creer(Depense depense);

    List<Depense> lire();

    Depense lire(long id);

    Depense modifier(long id, Depense depense);

    String supprimer(long id);
}

