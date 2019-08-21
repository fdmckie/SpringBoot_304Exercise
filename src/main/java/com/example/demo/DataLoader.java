package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car("Mazda", "Miata", 2009);
        repository.save(car);

        car = new Car("Dodge", "Ram", 2016);
        repository.save(car);

        car = new Car("Ford", "Mustang", 1974);
        repository.save(car);
    }
}
