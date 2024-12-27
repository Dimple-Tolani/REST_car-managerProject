package com.carstop.car_manager.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name="car_entry")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Car name is required")
    @Size(min = 2, max = 50, message = "Car name must be between 2 and 50 characters")
    private String name;

    @NotNull(message = "Model is required")
    @Size(min = 2, max = 50, message = "Model must be between 2 and 50 characters")
    private String model;

    @NotNull(message = "Year is required")
    @Min(value = 1900, message = "Year must be after 1886")
    @Max(value = 2025, message = "Invalid year")
    private Integer year;

    @NotNull(message = "Price is required")
    @Min(value = 1000, message = "Price must be a positive value")
    private Long price;

    @NotNull(message = "Color is required")
    @Size(min = 3, max = 20,  message = "Color must be between 3 and 20 characters")
    private String color;

    @NotNull(message = "Fuel type is required")
    @Pattern(regexp = "Petrol|Diesel|Electric|Hybrid", message = "Fuel type must be Petrol, Diesel, Electric, or Hybrid")
    private String fuel;
}
