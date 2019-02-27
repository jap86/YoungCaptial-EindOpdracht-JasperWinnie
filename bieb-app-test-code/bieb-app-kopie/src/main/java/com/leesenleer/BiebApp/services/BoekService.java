package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Boek;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoekService extends CrudRepository<Boek, Long>{
    List<Boek> findBoeksByAuteurContainsOrderByAuteur(String auteur);
    List<Boek> findBoeksByTitelContainsOrderByTitel(String titel);
    List<Boek> findBoeksByTitelContainsAndAuteurContains(String titel, String auteur);//DOET HET NIET, GEEFT LEGE ARRAY TERUG
}
