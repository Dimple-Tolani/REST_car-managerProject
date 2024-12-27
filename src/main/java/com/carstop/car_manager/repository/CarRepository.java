package com.carstop.car_manager.repository;

import com.carstop.car_manager.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
    @Query("SELECT c FROM CarEntity c WHERE " +
            "LOWER(c.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(c.model) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "CAST(c.year AS string) LIKE :keyword OR " +
            "LOWER(c.color) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(c.fuel) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<CarEntity> searchEntry(@Param("keyword") String keyword);
}
