package com.example.portfolioBackend.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Profit {
    @Id
    private String id;
    private double profitDolar;
    private double profitEuro;
    private String profitTypeDolar;
    private String profitTypeEuro;
    private double profitSterlin;
    private double profitG_Gold;
    private String profitTypeSterlin;
    private String profitTypeG_Gold;
    private double profitQ_Gold;
    private String profitTypeQ_Gold;


public String getId() {
        return id;
    }

public void setId(String id) {
        this.id = id;
}

public Profit( String profitTypeDolar,String profitTypeEuro,double profitDolar,
    double profitEuro,String profitTypeSterlin,String profitTypeG_Gold,double profitSterlin,
    double profitG_Gold,String profitTypeQ_Gold,double profitQ_Gold) {//DovizTuru enum olan
   
    this.profitDolar=profitDolar;
    this.profitTypeDolar=profitTypeDolar;
    this.profitEuro=profitEuro;
    this.profitTypeEuro=profitTypeEuro;
    this.profitSterlin=profitSterlin;
    this.profitTypeSterlin=profitTypeSterlin;
    this.profitG_Gold=profitG_Gold;
    this.profitTypeG_Gold=profitTypeG_Gold;
    this.profitQ_Gold=profitQ_Gold;
    this.profitTypeQ_Gold=profitTypeQ_Gold;
   
}

public String getProfitTypeDolar() {
    return profitTypeDolar;
}

public void setProfitTypeDolar(String profitTypeDolar) {
    this.profitTypeDolar = profitTypeDolar;
}
public double getProfitDolar() {
    return profitDolar;
}

public void setProfitDolar(double profitDolar) {
    this.profitDolar = profitDolar;
}

public String getProfitTypeEuro() {
    return profitTypeEuro;
}

public void setProfitTypeEuro(String profitTypeEuro) {
    this.profitTypeEuro = profitTypeEuro;
}
public double getProfitEuro() {
    return profitEuro;
}

public void setProfitEuro(double profitEuro) {
    this.profitEuro = profitEuro;
}
public String getProfitTypeSterlin() {
    return profitTypeSterlin;
}

public void setProfitTypeSterlin(String profitTypeSterlin) {
    this.profitTypeSterlin = profitTypeSterlin;
}
public double getProfitSterlin() {
    return profitSterlin;
}

public void setProfitSterlin(double profitSterlin) {
    this.profitSterlin = profitSterlin;
}

public String getProfitTypeG_Gold() {
    return profitTypeG_Gold;
}

public void setProfitTypeG_Gold(String profitTypeG_Gold) {
    this.profitTypeG_Gold = profitTypeG_Gold;
}
public double getProfitG_Gold() {
    return profitG_Gold;
}

public void setProfitG_Gold(double profitG_Gold) {
    this.profitG_Gold = profitG_Gold;
}

public String getProfitTypeQ_Gold() {
    return profitTypeQ_Gold;
}

public void setProfitTypeQ_Gold(String profitTypeQ_Gold) {
    this.profitTypeQ_Gold = profitTypeQ_Gold;
}
public double getProfitQ_Gold() {
    return profitQ_Gold;
}

public void setProfitQ_Gold(double profitQ_Gold) {
    this.profitQ_Gold = profitQ_Gold;
}

}