package com.example.springdatabasicdemo.repositories;
import com.example.springdatabasicdemo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
    List<Car> findAllById(Long id);
    List<Car> findCarById(Long id);
}
