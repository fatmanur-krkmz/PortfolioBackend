package com.example.portfolioBackend.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document

public class Altin {

    @Id
    private String id;
    private AltinTuru tur;
    private double unitPrice;
    private String created;
    private double quantity;

    public Altin(AltinTuru tur, double unitPrice, String created, double quantity) {
        this.tur = tur;
        this.unitPrice = unitPrice;
        this.created = created;
        this.quantity = quantity;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AltinTuru getTur() {
        return tur;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getCreated() {
        return created;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setTur(AltinTuru tur) {
        this.tur = tur;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
