package web.service;

import web.model.Car;

import java.util.List;

public interface CountCar {
    List<Car> countCars(int count);
    List<Car> allListCar();
}
