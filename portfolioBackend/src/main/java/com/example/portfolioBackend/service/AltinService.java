package com.example.portfolioBackend.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolioBackend.model.Altin;
import com.example.portfolioBackend.repository.AltinRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AltinService {
    @Autowired
    private final AltinRepository altinRepository;

    public List<Altin> getAllAltin() {
        return altinRepository.findAll();
    }

    public void addToAltin(Altin request) {
        altinRepository.save(request);
    }
    public void deleteAltin(String id) {
        altinRepository.deleteById(id);
    }


}
