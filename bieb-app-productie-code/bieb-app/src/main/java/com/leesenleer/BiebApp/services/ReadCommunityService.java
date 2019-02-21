package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.ReadCommunity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadCommunityService extends CrudRepository<ReadCommunity, Long> {
}
