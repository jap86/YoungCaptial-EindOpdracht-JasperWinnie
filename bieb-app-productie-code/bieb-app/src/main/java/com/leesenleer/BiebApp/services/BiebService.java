package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Bieb;
import com.leesenleer.BiebApp.model.Boek;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BiebService extends CrudRepository<Bieb, Long> {
  }
