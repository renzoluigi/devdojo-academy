package academy.devdojo.javaoneforall.javacore.ZZBbehavior.test;


import academy.devdojo.javaoneforall.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParameterTest03 {
    private static List<Car> cars = List.of(new Car("Green", 1999), new Car("White", 1951), new Car("Red", 1983));

    public static void main(String[] args) {
        List<Car> redCars = filter(cars, car -> car.getColor().equalsIgnoreCase("red"));
        List<Car> carsBefore1997 = filter(cars, car -> car.getYear() < 1997);
        System.out.println(redCars);
        System.out.println(carsBefore1997);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> predicate) { // Using the interface Predicate
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
