package web.service;

import web.Model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> carList;

    static {
        carList = Arrays.asList(new Car("Ferrari","Akhmed`s",12),
                new Car ("Toyota","Ruslan`s",2),
                new Car("Lada","Andrey`s",0),
                new Car("KIA","Elisabeth`s",4),
                new Car("BMW","Petr`s",20));
    }

    public static List<Car> getCarCount(long number) {
        return carList.stream().limit(number).collect(Collectors.toList());
    }

    public static List<Car> getCarList(long count) {
        if ((count == -1) | (count >=5 )) {
            return carList;
        } else {
            return getCarCount(count);
        }
    }
}
