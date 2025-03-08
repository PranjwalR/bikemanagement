package com.example.BikeManagement.service;


import com.example.BikeManagement.Dto.BikeDto;
import com.example.BikeManagement.Repo.BikeRepo;
import com.example.BikeManagement.entity.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {

    @Autowired
    BikeRepo bikeRepo;

    public Bike saveBike(BikeDto bikeDto) {
        Bike bike = new Bike();
        bike.setModelName(bikeDto.getModelName());
        bike.setBrandName(bikeDto.getBrandName());
        return bikeRepo.save(bike);
    }

}
