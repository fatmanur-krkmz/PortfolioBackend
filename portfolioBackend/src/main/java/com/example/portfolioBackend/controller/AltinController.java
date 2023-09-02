package com.example.portfolioBackend.controller;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolioBackend.model.Altin;
import com.example.portfolioBackend.service.AltinService;

import lombok.AllArgsConstructor;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/altin")
@AllArgsConstructor
public class AltinController {
    private final AltinService AltinService;

   @GetMapping
    public List<Altin> fetchAllAltin(){
        return AltinService.getAllAltin();
    }
   @PostMapping
    public void addToAltin(@RequestBody Altin request) {
        AltinService.addToAltin(request);
    }

}
