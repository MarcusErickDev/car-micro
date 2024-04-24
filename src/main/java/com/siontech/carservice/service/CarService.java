package com.siontech.carservice.service;

import com.siontech.carservice.entity.Car;
import com.siontech.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository CarRepository;

    public List<Car> getAll(){
        return CarRepository.findAll();
    }

    public Car getCarById(int id){
        return CarRepository.findById(id).orElse(null);
    }

    public Car save(Car car){
        Car carNew = CarRepository.save(car);
        return carNew;
    }

    public List<Car> byUserId(int userId){
        return CarRepository.findByUserId(userId);
    }
}
