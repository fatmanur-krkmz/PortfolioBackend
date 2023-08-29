package com.example.portfolioBackend;
import com.example.portfolioBackend.model.Financial;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/financiAl")
@AllArgsConstructor
public class FinancialController {
    private final FinancialService financialService;

   @GetMapping
    public List<Financial> fetchAllFinancial(){
        return financialService.getFinancial();
    }
   @PostMapping
    public void addToFinancial(@RequestBody Financial request) {
        financialService.addToFinancial(request);
    }
}