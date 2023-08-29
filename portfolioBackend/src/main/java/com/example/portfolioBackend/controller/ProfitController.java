package com.example.portfolioBackend.controller;
import com.example.portfolioBackend.model.Profit;
import com.example.portfolioBackend.service.ProfitService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/profit")
@AllArgsConstructor
public class ProfitController {
    private final ProfitService profitService;

    @GetMapping
    public List<Profit> fetchAllDoviz(){
       return profitService.getAllProfit();
    }

    @PostMapping
    public void addToPortfolio(@RequestBody Profit request) {
        profitService.addToPortfolio(request);
    }
}
