package com.lou.apimoneymanager.services;

import com.lou.apimoneymanager.models.Depense;
import com.lou.apimoneymanager.repository.DepenseRepository;
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

