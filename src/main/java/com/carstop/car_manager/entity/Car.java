package com.carstop.car_manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

   private Long id;
   private String name;
   private String model;
   private Integer year;
   private Long price;
   private String color;
   private String fuel;
}
