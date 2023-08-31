package com.example.portfolioBackend.repository;
import com.example.portfolioBackend.model.Profit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfitRepository extends MongoRepository<Profit,String> { //string ıd yi temsil ediyor.

}