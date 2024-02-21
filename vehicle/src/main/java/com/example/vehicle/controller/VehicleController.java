package com.example.vehicle.controller;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.vehicle.model.Vehicle;
import com.example.vehicle.service.VehicleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class VehicleController {
@Autowired
VehicleService vehicleService;
    @PostMapping("/addveh")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        
        return vehicleService.addVehicle(vehicle);
    }
    
    @GetMapping("/getveh")
    public List<Vehicle> getVehicles() {
        return vehicleService.getVehicles();
    }
    
    @GetMapping("/getveh/{userId}")
    public Optional<Vehicle> getVehicleById(@PathVariable Long userId) {
        return vehicleService.getVehicleById(userId);
    }
    @PutMapping("/putveh/{userId}")
    public Vehicle editVehicle(@PathVariable Long userId,@RequestBody Vehicle vehicle)
    {
        return vehicleService.editVehicle(userId, vehicle);
    }
    @DeleteMapping("/delveh/{userId}")
    public void deluser(@PathVariable Long userId)
    {
        vehicleService.deluser(userId);
    }
}