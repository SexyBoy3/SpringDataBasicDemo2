package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.Car;
import com.example.springdatabasicdemo.models.Vehicle;

import java.util.List;

public interface CarService<ID> {
    void register(Car car);

    void expel(Car car);

    void expel(ID id);
    void transfer(Car car, Vehicle vehicle);

    List<Car> findCar(ID id);

    List<Car> findcarByid(Long id);


}
