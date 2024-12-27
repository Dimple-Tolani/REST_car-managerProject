package com.carstop.car_manager.service;

import com.carstop.car_manager.entity.Car;
import com.carstop.car_manager.entity.CarEntity;
import com.carstop.car_manager.repository.CarRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarRepository carRepository;
    //List<Car> cars = new ArrayList<>();
    @Override
    public String createEntry(Car car) {
        CarEntity carEntity = new CarEntity();
        BeanUtils.copyProperties(car, carEntity);
        carRepository.save(carEntity);
        //cars.add(car);
        return "Saved!";
    }

    @Override
    public List<Car> readEntries() {
        List<CarEntity> carlist = carRepository.findAll();
        List<Car> cars = new ArrayList<>();

        for(CarEntity carE : carlist){
            Car car = new Car();
            car.setId(carE.getId());
            car.setName(carE.getName());
            car.setModel(carE.getModel());
            car.setYear(carE.getYear());
            car.setPrice(carE.getPrice());
            car.setColor(carE.getColor());
            car.setFuel(carE.getFuel());

            cars.add(car);
        }
        return cars;
    }

    @Override
    public Car readEntry(Long id) {
        CarEntity carE = carRepository.findById(id).get();
        Car car = new Car();
        BeanUtils.copyProperties(carE, car);
        return car;
    }

    @Override
    public List<Car> searchEntry(String keyword) {
        List<CarEntity> entities = carRepository.searchEntry(keyword);
        return entities.stream()
                .map(entity -> new Car(
                        entity.getId(),
                        entity.getName(),
                        entity.getModel(),
                        entity.getYear(),
                        entity.getPrice(),
                        entity.getColor(),
                        entity.getFuel()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteEntry(Long id) {
        //cars.remove(id);
        CarEntity car = carRepository.findById(id).get();
        carRepository.delete(car);
        return true;
    }

    @Override
    public String updateEntry(Long id, Car car) {
        CarEntity exEntity =  carRepository.findById(id).get();

        exEntity.setName(car.getName());
        exEntity.setModel(car.getModel());
        exEntity.setYear(car.getYear());
        exEntity.setPrice(car.getPrice());
        exEntity.setColor(car.getColor());
        exEntity.setFuel(car.getFuel());

        carRepository.save(exEntity);
        return "Updated!";
    }

}
