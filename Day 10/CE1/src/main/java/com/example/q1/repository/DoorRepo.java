package com.example.q1.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.model.Door;

@Repository
public interface DoorRepo extends JpaRepository<Door,Integer> {
   


    
    List<Door>findByColor(String color);


    List<Door>findByDoorType(String doorType);

   
    List<Door>findByDoorId(int doorId);

   

   

    
}