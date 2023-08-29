package com.example.portfolioBackend.service;


import com.example.portfolioBackend.model.Financial;
import com.example.portfolioBackend.repository.FinancialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;




@AllArgsConstructor
@Service
public class FinancialService {
    private final FinancialRepository financialRepository;

    public List<Financial> getFinancial() {
        return financialRepository.findAll();
    }

    public void addToFinancial(Financial request) {
        financialRepository.save(request);
    }


}
