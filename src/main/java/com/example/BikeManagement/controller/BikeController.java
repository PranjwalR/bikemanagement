package com.example.BikeManagement.controller;

import com.example.BikeManagement.Dto.BikeDto;
import com.example.BikeManagement.entity.Bike;
import com.example.BikeManagement.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class BikeController {

    @Autowired
    BikeService bikeService;

    @PostMapping("/save")
    public ResponseEntity<Bike> saveBike(@RequestBody BikeDto bikeDto) {
        return new ResponseEntity<>(bikeService.saveBike(bikeDto), HttpStatus.OK);
    }

    @GetMapping("/getvalue/{id}")
    public ResponseEntity<?> getvalue(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
