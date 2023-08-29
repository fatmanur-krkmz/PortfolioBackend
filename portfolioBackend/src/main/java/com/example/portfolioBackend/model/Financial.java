package com.example.portfolioBackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Financial {
    @Id
    private String id_f;

    public String getId_f() {
        return id_f;
    }

    public void setId_f(String id_f) {
        this.id_f = id_f;
    }

    public DovizTuru getDovizTuru_f() {
        return dovizTuru_f;
    }

    public void setDovizTuru_f(DovizTuru dovizTuru_f) {
        this.dovizTuru_f = dovizTuru_f;
    }

    public double getUnitPrice_f() {
        return unitPrice_f;
    }

    public void setUnitPrice_f(double unitPrice_f) {
        this.unitPrice_f = unitPrice_f;
    }

    private DovizTuru dovizTuru_f;
    private double unitPrice_f;
    public Financial(DovizTuru dovizTuru_f, double unitPrice_f) {
        this.dovizTuru_f = dovizTuru_f;
        this.unitPrice_f = unitPrice_f;


    }
}
