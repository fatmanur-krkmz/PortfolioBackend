package com.example.portfolioBackend.service;
import com.example.portfolioBackend.model.Altin;
import com.example.portfolioBackend.repository.AltinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class AltinService {
    private final AltinRepository altinRepository;

    public List<Altin> getAllAltin() {
        return altinRepository.findAll();
    }

    public void addToAltin(Altin request) {
        altinRepository.save(request);
    }


}
