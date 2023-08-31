package com.example.portfolioBackend.repository;

import com.example.portfolioBackend.model.Altin;
import org.springframework.data.mongodb.repository.MongoRepository;


    public  interface AltinRepository extends MongoRepository<Altin,Integer> {

    }

