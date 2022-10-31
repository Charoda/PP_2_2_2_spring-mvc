package web.service;

import web.Model.Car;

import java.util.Arrays;
import java.util.List;

public class CarService {

    public static List<Car> getCarList() {
        return Arrays.asList(new Car("Ferrari","Akhmed`s",12),
                new Car ("Toyota","Ruslan`s",2),
                new Car("Lada","Andrey`s",0),
                new Car("KIA","Elisabeth`s",4),
                new Car("BMW","Petr`s",20));
    }

}
