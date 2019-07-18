package me.lucasfelix.car;

import me.lucasfelix.car.domain.Car;
import me.lucasfelix.car.ports.CarRepository;

public class CreateCar {

    private final CarRepository carRepository;

    public CreateCar(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void save(Car car) {
        carRepository.save(car);
    }
}
