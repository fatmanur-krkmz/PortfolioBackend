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
    private String profitType;


public String getId() {
        return id;
    }

public void setId(String id) {
        this.id = id;
}

public Profit( String profitType,double profit ) {//DovizTuru enum olan
   
    this.profit=profit;
    this.profitType=profitType;
   
}

public String getProfitType() {
    return profitType;
}

public void setProfitType(String profitType) {
    this.profitType = profitType;
}
public double getProfit() {
    return profit;
}

public void setProfit(double profit) {
    this.profit = profit;
}

}