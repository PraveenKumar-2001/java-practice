package com.example.foodorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodorder.model.MenuItem;
import com.example.foodorder.repository.MenuRepository;

@Service
public class MenuService {

    @Autowired
    private MenuRepository repository;

    //create
    public MenuItem addItem(MenuItem item){
        return repository.save(item);
    }

    //Read
    public List<MenuItem> getAllItems(){
        return repository.findAll();
    }
    public MenuItem getById(Long id){
        return repository.findById(id).orElseThrow(() ->new  RuntimeException("id not found"));
    }

    //update

    public MenuItem updatItem(Long id,MenuItem item){

        MenuItem mi= repository.findById(id).orElseThrow();

        mi.setName(item.getName());
        mi.setPrice(item.getPrice());
        mi.setCategory(item.getCategory());
        mi.setAvailability(item.getAvailability());

        return repository.save(mi);
    }

    //Delete
    public String deleteItem(Long id){
        repository.deleteById(id);

        return "Item Deleted Successfully";
    }


    
}
