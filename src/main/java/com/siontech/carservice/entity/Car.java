package com.siontech.carservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cars")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
//    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String brand;
    private String model;
    private int userId;
}
