package com.example.BikeManagement.Dto;

import lombok.Data;

@Data
public class BikeDto {


    private String modelName;
    private String brandName;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
