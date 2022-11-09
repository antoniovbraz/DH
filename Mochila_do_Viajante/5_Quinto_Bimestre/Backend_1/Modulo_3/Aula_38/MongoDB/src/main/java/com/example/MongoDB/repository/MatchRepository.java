package com.example.MongoDB.repository;

import com.example.MongoDB.model.MatchModel;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository  extends MongoRepository<MatchModel,Integer> {
    List
}
