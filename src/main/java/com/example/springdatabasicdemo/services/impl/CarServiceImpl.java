package com.example.springdatabasicdemo.services.impl;


import com.example.springdatabasicdemo.models.Car;
import com.example.springdatabasicdemo.models.Vehicle;
import com.example.springdatabasicdemo.repositories.CarRepository;
import com.example.springdatabasicdemo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService<Long> {

    @Autowired
    private CarRepository carRepository;
    @Override
    public void register(Car car){carRepository.save(car);}

    @Override
    public void expel(Car car) {

    }

    @Override
    public void expel(Long id){carRepository.deleteById(id);}

    @Override
    public List<Car> findCar(Long id) {
        return carRepository.findCarById(id);
    }

    @Override
    public List<Car> findcarByid(Long id) {
        return null;
    }

    public void transfer(Car car, Vehicle vehicle) {

        carRepository.save(car);
    }


}