package com.example.portfolioBackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.portfolioBackend.model.Altin;
import com.example.portfolioBackend.service.AltinService;
import lombok.AllArgsConstructor;


@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/altin")
@AllArgsConstructor
@RestController

public class AltinController {
    @Autowired
    private final AltinService AltinService;

    @GetMapping
    public List<Altin> fetchAllAltin(){
        return AltinService.getAllAltin();
    }
   @PostMapping
    public void addToAltin(@RequestBody Altin request) {
        AltinService.addToAltin(request);
    }

    @DeleteMapping("/{id}")
    public void deleteAltin(@PathVariable String id) { 
    AltinService.deleteAltin(id);
}
}
