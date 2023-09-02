package com.example.portfolioBackend.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.portfolioBackend.model.Doviz;
import com.example.portfolioBackend.repository.DovizRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DovizService {

    private final DovizRepository dovizRepository;
    public List<Doviz> getAllDoviz() {
        return dovizRepository.findAll();
    }

    public void addToPortfolio(Doviz request) {
        dovizRepository.save(request);
    }

    public void deleteDoviz(String id) {
        // Veriyi silme işlemini burada gerçekleştirin
        dovizRepository.deleteById(id); // Veya özel bir sorgu kullanabilirsiniz
    }

}
