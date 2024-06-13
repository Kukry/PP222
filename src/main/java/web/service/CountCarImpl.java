package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CountCarImpl implements CountCar {
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", 6, "black"));
        carList.add(new Car("Ferrari", 40, "red"));
        carList.add(new Car("Lamborgini", 50, "yellow"));
        carList.add(new Car("Porsche", 900, "white"));
        carList.add(new Car("Lada", 99, "purple"));
    }

    @Override
    public List<Car> countCars(int count) {
        int i = 0;
        List<Car> countList = new ArrayList<>();
        if (count > 0 && count < carList.size()) {
            while (i < count) {
                countList.add(carList.get(i));
                i++;
            }
        } else if (count >= carList.size()) {
            return carList;
        } else {
            return null;
        }
        return countList;
    }

    @Override
    public List<Car> allListCar() {
        return carList;
    }
}