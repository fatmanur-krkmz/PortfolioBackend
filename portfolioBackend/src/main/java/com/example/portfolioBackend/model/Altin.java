package com.example.portfolioBackend.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Altin {

    @Id
    private String id_altin;
    private AltinTuru altinTuru;
    private double unitPrice;
    private String created_altin;
    private double quantity;

    public Altin(AltinTuru altinTuru, double unitPrice, String created_altin, double quantity) {
        this.altinTuru = altinTuru;
        this.unitPrice = unitPrice;
        this.created_altin = created_altin;
        this.quantity = quantity;
    }




    public String getId_altin() {
        return id_altin;
    }

    public void setId_altin(String id_altin) {
        this.id_altin = id_altin;
    }

    public AltinTuru getAltinTuru() {
        return altinTuru;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getCreated_altin() {
        return created_altin;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setAltinTuru(AltinTuru altinTuru) {
        this.altinTuru = altinTuru;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setCreated_altin(String created_altin) {
        this.created_altin = created_altin;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
