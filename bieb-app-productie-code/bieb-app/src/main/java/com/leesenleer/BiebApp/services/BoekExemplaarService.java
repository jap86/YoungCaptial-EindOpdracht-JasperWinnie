package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.BoekExemplaar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoekExemplaarService extends CrudRepository <BoekExemplaar, Long> {
    List<BoekExemplaar> findBoeksByAuteurContainsOrderByAuteur(String auteur);
    List<BoekExemplaar> findBoeksByTitelContainsOrderByTitel(String titel);
    List<BoekExemplaar> findByTitelOrAuteurOrderByAuteur(String titel, String auteur);
}
