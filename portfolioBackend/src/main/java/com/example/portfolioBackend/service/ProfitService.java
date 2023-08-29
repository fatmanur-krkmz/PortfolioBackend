package com.example.portfolioBackend.service;
//import com.example.portfolioBackend.model.Doviz;
import com.example.portfolioBackend.model.Profit;
//import com.example.portfolioBackend.repository.DovizRepository;
import com.example.portfolioBackend.repository.ProfitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProfitService {
    private final ProfitRepository profitRepository;
    public List<Profit> getAllProfit() {
        return profitRepository.findAll();
    }

    public void addToPortfolio(Profit request) {
        profitRepository.save(request);
    }

}
