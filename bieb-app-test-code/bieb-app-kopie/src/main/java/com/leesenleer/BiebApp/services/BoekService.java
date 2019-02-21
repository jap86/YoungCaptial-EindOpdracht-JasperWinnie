package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Boek;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoekService extends CrudRepository <Boek, Long> {
    List<Boek> findByBiebId(Long biedid);
}
