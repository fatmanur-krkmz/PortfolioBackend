package com.example.portfolioBackend.repository;

import com.example.portfolioBackend.model.Doviz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DovizRepository extends MongoRepository<Doviz,String> { //string ıd yi temsil ediyor.

}
