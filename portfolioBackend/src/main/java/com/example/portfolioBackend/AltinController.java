package com.example.portfolioBackend;
import com.example.portfolioBackend.model.Altin;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
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
