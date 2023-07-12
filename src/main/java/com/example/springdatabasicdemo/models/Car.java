package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "Car")
public class Car extends Vehicle{

    @Column(name="seats",length = 50, nullable = false)
    private int seats;
    public Car(){}
    public Car(String type,String model, BigDecimal price, String fueltype, int seats) {
        this.type=type;
        this.model=model;
        this.price=price;
        this.fueltype=fueltype;
        this.seats = seats;
    }
    public int getseats() {return seats;}}



