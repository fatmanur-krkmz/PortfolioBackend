package com.example.portfolioBackend.service;
import com.example.portfolioBackend.model.Doviz;
import com.example.portfolioBackend.repository.DovizRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

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

}
