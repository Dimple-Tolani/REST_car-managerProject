package com.carstop.car_manager.controller;

import com.carstop.car_manager.entity.CarEntity;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carstop.car_manager.entity.Car;
import com.carstop.car_manager.service.CarService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api/cars/")
public class    CarController {
    @Autowired
    CarService carservice; //Dependency Injection

    @GetMapping("cars")
    public List<Car> getAllCars(){
        return carservice.readEntries();
    }

    @GetMapping("cars/{id}")
    public Car getAllCarsById(@PathVariable  @Min(1) Long id){
        return carservice.readEntry(id);
    }

    @PostMapping("cars")
    public String createEntry(@Valid @RequestBody Car car){
        return carservice.createEntry(car);
    }

    @DeleteMapping("cars/{id}")
    public String deleteEntry(@PathVariable  @Min(1) Long id){
       if(carservice.deleteEntry(id))
           return "Deleted!";
       return "Not Found!";
    }

    @PutMapping("cars/{id}")
    public String updateEntry(@PathVariable  @Min(1) Long id,@Valid @RequestBody Car car){
        return carservice.updateEntry(id, car);
    }

    @GetMapping("/search")
    public List<Car> searchEntry(@RequestParam String keyword) {
        return carservice.searchEntry(keyword);
    }
}
