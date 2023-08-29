package com.example.portfolioBackend.controller;

import com.example.portfolioBackend.model.Doviz;
import com.example.portfolioBackend.service.DovizService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/doviz")
@AllArgsConstructor
public class DovizController {
    private final DovizService dovizService;

    @GetMapping
    public List<Doviz> fetchAllDoviz(){
       return dovizService.getAllDoviz();
    }

    @PostMapping
    public void addToPortfolio(@RequestBody Doviz request) {
        dovizService.addToPortfolio(request);
    }
}
