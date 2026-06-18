package com.example.foodorder.model;

import jakarta.persistence.*;

@Entity
@Table(name= "menu_item")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private Double price;
    private String category;
    private Boolean availability;

    public MenuItem(){

    }

    public MenuItem(Long id, String name, Double price, String category, Boolean availability) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
    
    
}
