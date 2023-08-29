package com.example.portfolioBackend.repository;

import com.example.portfolioBackend.model.Financial;
import org.springframework.data.mongodb.repository.MongoRepository;


    public  interface FinancialRepository extends MongoRepository<Financial,Integer> {

    }

