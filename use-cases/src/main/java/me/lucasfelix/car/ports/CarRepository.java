package me.lucasfelix.car.ports;

import me.lucasfelix.car.domain.Car;

public interface CarRepository {

    public Car save(Car car);
}
