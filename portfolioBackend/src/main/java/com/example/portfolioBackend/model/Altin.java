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
    private double unitPrice_altin;
    private String created_altin;
    private double quantity_altin;

    public Altin(AltinTuru altinTuru, double unitPrice_altin, String created_altin, double quantity_altin) {
        this.altinTuru = altinTuru;
        this.unitPrice_altin = unitPrice_altin;
        this.created_altin = created_altin;
        this.quantity_altin = quantity_altin;
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

    public double getUnitPrice_altin() {
        return unitPrice_altin;
    }

    public String getCreated_altin() {
        return created_altin;
    }

    public double getQuantity_altin() {
        return quantity_altin;
    }

    public void setAltinTuru(AltinTuru altinTuru) {
        this.altinTuru = altinTuru;
    }

    public void setUnitPrice_altin(double unitPrice_altin) {
        this.unitPrice_altin = unitPrice_altin;
    }

    public void setCreated_altin(String created_altin) {
        this.created_altin = created_altin;
    }

    public void setQuantity_altin(double quantity_altin) {
        this.quantity_altin = quantity_altin;
    }
}
