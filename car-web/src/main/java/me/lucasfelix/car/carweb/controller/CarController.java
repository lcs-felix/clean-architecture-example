package me.lucasfelix.car.carweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cars")
@RestController
public class CarController {

    @PostMapping
    public void save(Car c) {

    }
}
