package com.example.portfolioBackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.portfolioBackend.model.Altin;


    public  interface AltinRepository extends MongoRepository<Altin,String> {
    
    }

