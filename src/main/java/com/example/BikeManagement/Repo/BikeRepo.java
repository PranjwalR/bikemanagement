package com.example.BikeManagement.Repo;

import com.example.BikeManagement.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepo extends JpaRepository<Bike,Integer> {

}
