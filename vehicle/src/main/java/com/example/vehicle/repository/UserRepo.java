package com.example.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.vehicle.model.User;


@Repository
public interface UserRepo extends JpaRepository<User,Long>{
   
}