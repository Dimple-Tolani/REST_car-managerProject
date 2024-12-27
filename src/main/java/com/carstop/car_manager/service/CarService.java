package com.carstop.car_manager.service;

import com.carstop.car_manager.entity.Car;
import com.carstop.car_manager.repository.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarService {
    String createEntry(Car car);
    List<Car> readEntries();
    boolean deleteEntry(Long id);
    String updateEntry(Long id, Car car);
    Car readEntry(Long id);
    List<Car> searchEntry(String keyword);
}
