package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Bieb;
import com.leesenleer.BiebApp.model.Boek;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiebService extends CrudRepository<Bieb, Long> {
//bo.id, bo.aantal_bladzijden, bo.auteur, bo.jaar_van_uitgave, bo.titel, bo.bieb_id
//  @Query(value = "SELECT *  FROM boek bo WHERE bo.id = :biebid ", nativeQuery = true)
//  List<Boek> findBoekByBiebID(@Param("biebid") long biebid);

  }
