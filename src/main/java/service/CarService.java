package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> createCars();

    List<Car> getCars(Long count);
}
