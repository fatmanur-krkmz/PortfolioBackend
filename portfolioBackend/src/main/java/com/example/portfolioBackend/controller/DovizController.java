
package com.example.portfolioBackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolioBackend.model.Doviz;
import com.example.portfolioBackend.service.DovizService;

import lombok.AllArgsConstructor;

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
    @DeleteMapping("/{id}")
    public void deleteDoviz(@PathVariable String id) { 
    dovizService.deleteDoviz(id);
}
}

