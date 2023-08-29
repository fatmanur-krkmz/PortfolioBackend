package com.example.portfolioBackend.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Profit {
    @Id
    private String id;
    private double profit;


public String getId() {
        return id;
    }

public void setId(String id) {
        this.id = id;
}

public Profit( double profit ) {
   
    this.profit=profit;
   
}
public double getProfit() {
    return profit;
}

public void setProfit(double profit) {
    this.profit = profit;
}

}