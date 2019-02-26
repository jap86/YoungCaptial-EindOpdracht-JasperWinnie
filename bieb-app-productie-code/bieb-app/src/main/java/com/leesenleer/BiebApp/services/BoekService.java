package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Boek;
import org.springframework.data.repository.CrudRepository;

public interface BoekService extends CrudRepository<Boek, Long>{
    Iterable<Boek> findBoeksByAuteurContains(String auteur);
    Iterable<Boek> findBoeksByTitelContains(String titel);
    Iterable<Boek> findBoeksByTitelContainsAndAuteurContains(String titel, String auteur);
}
