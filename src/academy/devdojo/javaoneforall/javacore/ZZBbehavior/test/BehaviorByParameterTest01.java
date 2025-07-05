package academy.devdojo.javaoneforall.javacore.ZZBbehavior.test;


import academy.devdojo.javaoneforall.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest01 {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Green", 1999),
                new Car("White", 1951),
                new Car("Red", 1983));

        System.out.println(filterByColor(cars, "green"));
        System.out.println(filterByColor(cars, "red"));

        System.out.println(filterByYearBefore(cars, 1943));
        System.out.println(filterByYearBefore(cars, 2007));
    }

    private static List<Car> filterByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    };
}
