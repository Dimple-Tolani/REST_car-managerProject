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

    @NotNull
    @Size(min = 2, max = 50)
    private String name;

    @NotNull
    @Size(min = 2, max = 50)
    private String model;

    @NotNull
    @Min(value = 1900)
    @Max(value = 2025)
    private Integer year;

    @NotNull
    @Min(value = 1000)
    private Long price;

    @NotNull
    @Size(min = 3, max = 20)
    private String color;

    @NotNull
    @Pattern(regexp = "Petrol|Diesel|Electric|Hybrid")
    private String fuel;
}
