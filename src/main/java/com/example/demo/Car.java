package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3)
    private String carMake;

    @NotNull
    @Size(min=2)
    private String carModel;

    @NotNull
    @Min(1900)
    private long carYear;

    public Car(@NotNull @Size(min = 3) String carMake, @NotNull @Size(min = 2) String carModel, @NotNull @Min(1900) long carYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public long getCarYear() {
        return carYear;
    }

    public void setCarYear(long carYear) {
        this.carYear = carYear;
    }
}
