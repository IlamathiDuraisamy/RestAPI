package com.example.vehicle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle.model.Vehicle;
import com.example.vehicle.repository.VehicleRepo;

@Service
public class VehicleService {
@Autowired
VehicleRepo vehicleRepo;
public Vehicle addVehicle(Vehicle vehicle)
{
    return vehicleRepo.save(vehicle);
}

public List<Vehicle> getVehicles()
{
    return vehicleRepo.findAll();
}
public Optional<Vehicle> getVehicleById(Long userId)
{
    return vehicleRepo.findById(userId);
}
public void deluser(Long userId)
{
    vehicleRepo.deleteById(userId);
}
public Vehicle editVehicle(Long userId,Vehicle vehicle)
{
    Vehicle vehicleAvail=vehicleRepo.findById(userId).orElse(null);
    if(vehicleAvail!=null)
    {
        vehicleAvail.setUserName(vehicle.getUserName());
        vehicleAvail.setEmailAddress(vehicle.getEmailAddress());
        vehicleAvail.setPassword(vehicle.getPassword());
        vehicleAvail.setConfirmPassword(vehicle.getConfirmPassword());
        vehicleAvail.setServices(vehicle.getServices());
        vehicleAvail.setType(vehicle.getType());
        return vehicleRepo.saveAndFlush(vehicleAvail);
    }
    else
    {
        return null;
    }
}



}