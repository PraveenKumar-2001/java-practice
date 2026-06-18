package com.example.foodorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodorder.model.MenuItem;

public interface MenuRepository extends JpaRepository<MenuItem,Long>{
    
}
