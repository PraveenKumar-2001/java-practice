package com.example.foodorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodorder.model.MenuItem;
import com.example.foodorder.service.MenuService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/menu")
public class MenuController {
    
    @Autowired
    private MenuService service;

    //Create
    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem item){
        return service.addItem(item);
    }

         @GetMapping
        public List<MenuItem> getAllMenuItem() 
        {
        return service.getAllItems();
        }
         @GetMapping("/{id}")
        public MenuItem getMenuById(@PathVariable Long id){
            return service.getById(id);

        }

    @PutMapping("/{id}")
    public MenuItem updateMenuItem(@PathVariable Long id,@RequestBody MenuItem item)
    {
        return service.updatItem(id, item);
    }
    @DeleteMapping("/{id}")
    public String deleteMenuItem(@PathVariable Long id)
    {
        return service.deleteItem(id);
    }


    
}
