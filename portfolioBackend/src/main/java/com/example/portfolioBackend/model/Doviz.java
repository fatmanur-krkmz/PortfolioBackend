package com.example.portfolioBackend.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Data
@Document
public class Doviz {


    @Id
    private String id;
    private DovizTuru tur;
    private double unitPrice;
    private String created;
    private double quantity;
    



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public Doviz(DovizTuru tur, double unitPrice, String created, double quantity ) {
        this.tur = tur;
        this.unitPrice = unitPrice;
        this.created = created;
        this.quantity = quantity;


    }


    public DovizTuru getTur() {
        return tur;
    }

    public void setTur(DovizTuru tur) {
        this.tur = tur;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
   




}
