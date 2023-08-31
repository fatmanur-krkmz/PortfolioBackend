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
    private DovizTuru profitType;


public String getId() {
        return id;
    }

public void setId(String id) {
        this.id = id;
}

public Profit( DovizTuru profitType,double profit ) {//DovizTuru enum olan
   
    this.profit=profit;
    this.profitType=profitType;
   
}

public DovizTuru getProfitType() {
    return profitType;
}

public void setProfitType(DovizTuru profitType) {
    this.profitType = profitType;
}
public double getProfit() {
    return profit;
}

public void setProfit(double profit) {
    this.profit = profit;
}

}