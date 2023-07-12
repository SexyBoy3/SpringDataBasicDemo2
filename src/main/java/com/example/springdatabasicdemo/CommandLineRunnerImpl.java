package com.example.springdatabasicdemo;
import com.example.springdatabasicdemo.models.*;
import com.example.springdatabasicdemo.repositories.BikeRepository;
import com.example.springdatabasicdemo.repositories.CarRepository;
import com.example.springdatabasicdemo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.math.BigDecimal;
@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private CarService carService;
    private final BikeRepository BikeRepository;
    private final CarRepository CarRepository;
    public CommandLineRunnerImpl(BikeRepository BikeRepository, CarRepository CarRepository) {
        this.BikeRepository = BikeRepository;
        this.CarRepository = CarRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        seedData();
        printAllCars();
        printAllCarsById(Long.parseLong("12"));
    }
    private void printAllCarsById(Long id) {
        CarRepository
                .findAllById(id)
                .forEach(System.out::println);
    }
    private void printFindCarById(){
        CarRepository
                .findCarById(Long.parseLong("12"))
                .forEach(System.out::println);
    }
    private void printAllCars() {
        CarRepository
                .findAll()
                .forEach(System.out::println);
    }
    private void seedData() throws IOException {
        //Добавление в БД записей
        BigDecimal n = new BigDecimal(213);

        Car s1 = new Car("cacr","BMW",n,"95",4);
        Plane s2 = new Plane("China",n,"Дизель","S7",300);
        Truck g1 = new Truck("5126R", n,"Дизель",234.1);
        Bike g2 = new Bike("Ujas12",n,"Дизель");

        s1.getseats();
        s1.setModel("Cacazu");
        carService.register(s1);
        CarRepository.save(s1);
    }
}
