package com.example.CrudApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sales {

    @Id
    @GeneratedValue
    private Long id;

    private String productName;
    private Boolean availability;

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}


