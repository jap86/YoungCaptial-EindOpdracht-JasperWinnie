package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Bieb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoegBiebToeFormService extends CrudRepository<Bieb, Integer> {
}
