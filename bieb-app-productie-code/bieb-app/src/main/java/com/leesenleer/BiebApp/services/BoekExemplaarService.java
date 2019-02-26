package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.BoekExemplaar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoekExemplaarService extends CrudRepository <BoekExemplaar, Long> {
//    List<BoekExemplaar> findByBiebId(Long biedid);

}
